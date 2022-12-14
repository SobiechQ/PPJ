package W10.W10_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int total = (int) (Math.pow(size, 2) / 5);
        char mapArr[][] = new char[size][size];
        for (int i = 0; i < mapArr.length; i++) {
            for (int j = 0; j < mapArr[0].length; j++) {
                mapArr[i][j]='X';
            }
        }
        for (char[] i:mapArr) {
            System.out.println(Arrays.toString(i));
        }
        //todo dokończyć to xD
    }
    public static char[][] generateMaze(char[][] mapArr, int stepsToDo){

        return mapArr;
    }
}
