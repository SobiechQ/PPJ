package W10.W10_4;
import java.util.Scanner;

public class Main{
    public static final char EMPTY='\u2588';
    public static final char SYMBOL='\u2591';
    public static void main(String[] args) {
        int size = 30;
        int total= (int) (Math.pow(size,2)/5);
        char[][] mapArr = new char[size][size];
        for (int i = 0; i < mapArr.length; i++) {
            for (int j = 0; j < mapArr[0].length; j++) {
                mapArr[i][j]= SYMBOL;
            }
        }
        //startPos
        int[] currPos={(int) (Math.random()*(size)), (int) (Math.random()*(size))};
        mapArr[currPos[0]][currPos[1]]= EMPTY;
        int countMove=0;
        int[] posMove=new int[4];
        int indexPosMove=0;
        int[][] stackMove=new int[total][2];
        int indexStackMove=0;
        while (countMove<total){
            //czy jest możliwe:
            //dwa w góre?
            if(currPos[0]>=2&&
                    mapArr[currPos[0]-2][currPos[1]]== SYMBOL &&
                    mapArr[currPos[0]-1][currPos[1]]== SYMBOL
            ){
                //da się w górę
                posMove[indexPosMove]=0;
                indexPosMove++;
            }
            //dwa w dół?
            if(currPos[0]<size-2&&
                    mapArr[currPos[0]+2][currPos[1]]== SYMBOL &&
                    mapArr[currPos[0]+1][currPos[1]]== SYMBOL
            ){
                //da się w doł
                posMove[indexPosMove]=1;
                indexPosMove++;
            }
            //dwa w lewo?
            if(currPos[1]>2&&
                    mapArr[currPos[0]][currPos[1]-2]== SYMBOL &&
                    mapArr[currPos[0]][currPos[1]-1]== SYMBOL
            ){
                //da się w lewo
                posMove[indexPosMove]=2;
                indexPosMove++;
            }

            //dwa w prawo?
            if(currPos[1]<size-2&&
                    mapArr[currPos[0]][currPos[1]+2]== SYMBOL &&
                    mapArr[currPos[0]][currPos[1]+1]== SYMBOL
            ){
                //da się w prawo
                posMove[indexPosMove]=3;
                indexPosMove++;
            }

            int wylosowanyRuch=posMove[(int) (Math.random()*(indexPosMove))];
            if(indexPosMove==0){
                //sprawdzenie czy nie dalo sie ruszyc
                wylosowanyRuch=4;
            }
            switch (wylosowanyRuch){
                case 0->{
                    //góra
                    mapArr[currPos[0]-1][currPos[1]]= EMPTY;
                    mapArr[currPos[0]-2][currPos[1]]= EMPTY;
                    //zapis do stosu pozycji przed ruchem
                    stackMove[indexStackMove][0]=currPos[0];
                    stackMove[indexStackMove][1]=currPos[1];
                    indexStackMove++;

                    currPos[0]-=2;
                }
                case 1->{
                    //dół
                    mapArr[currPos[0]+1][currPos[1]]= EMPTY;
                    mapArr[currPos[0]+2][currPos[1]]= EMPTY;
                    //zapis do stosu pozycji przed ruchem
                    stackMove[indexStackMove][0]=currPos[0];
                    stackMove[indexStackMove][1]=currPos[1];
                    indexStackMove++;
                    currPos[0]+=2;
                }
                case 2->{
                    //lewo
                    mapArr[currPos[0]][currPos[1]-1]= EMPTY;
                    mapArr[currPos[0]][currPos[1]-2]= EMPTY;
                    //zapis do stosu pozycji przed ruchem
                    stackMove[indexStackMove][0]=currPos[0];
                    stackMove[indexStackMove][1]=currPos[1];
                    indexStackMove++;
                    currPos[1]-=2;
                }
                case 3->{
                    //prawo
                    mapArr[currPos[0]][currPos[1]+1]= EMPTY;
                    mapArr[currPos[0]][currPos[1]+2]= EMPTY;
                    //zapis do stosu pozycji przed ruchem
                    stackMove[indexStackMove][0]=currPos[0];
                    stackMove[indexStackMove][1]=currPos[1];
                    indexStackMove++;
                    currPos[1]+=2;
                }
                case 4->{
                    //brak opcji ruchu, cofka do wczesniejszego
                    indexStackMove--;
                    currPos[0]=stackMove[indexStackMove][0];
                    currPos[1]=stackMove[indexStackMove][1];
                }
            }
            indexPosMove=0;
            countMove++;
        }
        //pozyja Startowa:
        char[][] pos;
        int[][] tmpPos = new int[total*3][2];
        int xTmp=0;
        int yTmp=0;
        int indexAllPossible=0;
        for (char[] xCharArr:mapArr) {
            for(char yChar:xCharArr){
                if(yChar== EMPTY){
                    tmpPos[indexAllPossible][0] = xTmp;
                    tmpPos[indexAllPossible++][1] = yTmp;

                }
                xTmp++;
            }
            xTmp=0;
            yTmp++;
        }
        //obiekt plasy player.
        //start pos.
        int randomSeed= (int) (Math.random()*indexAllPossible);
        Player player = new Player(tmpPos[randomSeed][1],tmpPos[randomSeed][0]);
        Scanner sc = new Scanner(System.in);
        char c=' ';
        do{
            switch (c){
                case 'a'->{
                    for (int i = 0; i < 3; i++)
                        player.addPos();
                }
                case 'd'-> player.addPos();
                case 'w'->{
                        switch (player.facing%4){

                            case 0-> updateArr(mapArr, player,new int[]{-1,0});
                            case 1->updateArr(mapArr, player,new int[]{0,1});
                            case 2->updateArr(mapArr, player,new int[]{1,0});
                            case 3->updateArr(mapArr, player,new int[]{0,-1});
                        }
                }
            }
            draw(mapArr, player);
        }while ((c = sc.next().charAt(0))!='q');
    }
    public static void updateArr(char[][] input, Player player, int[] vector){
        try{
            if(input[player.x+vector[0]][player.y+vector[1]]== EMPTY) {
                input[player.x+vector[0]][player.y+vector[1]] = player.body;
                input[player.x][player.y]=EMPTY;
                player.updatePos(player.x+vector[0],player.y+vector[1]);
            }
        }catch (Exception e){
            System.out.println("Wyjście poza obszar");
        }
    }
    public static void draw(char[][] input, Player player){
        input[player.x][player.y]= player.getBody();
        for (char[] i:input) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(""+i[j]+" ");
            }
            System.out.println(" ");
        }
    }
}
