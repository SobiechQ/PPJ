package W13.W13_8;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10);
        }
        for(int i:arr){
            System.out.print(i+", ");
        }

//Select sort
//        int maxFound=Integer.MIN_VALUE;
//        int indexOfMax=0;
//        int toSort;
//        for(toSort=arr.length;toSort>1;toSort--) {
//            maxFound=Integer.MIN_VALUE;
//            indexOfMax=0;
//            for (int j = 0; j < toSort; j++) {
//                if (arr[j] > maxFound) {
//                    maxFound = arr[j];
//                    indexOfMax = j;
//                }
//            }
//            int tmpSwitchVal = arr[toSort - 1];
//            arr[toSort - 1] = maxFound;
//            arr[indexOfMax] = tmpSwitchVal;
//        }

        //Bubble
        for(int toSort=arr.length; toSort>1; toSort--) {
            for (int i = 1; i < toSort; i++) {
                int tmpSwitchVal;
                if (arr[i] < arr[i - 1]) {
                    tmpSwitchVal = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmpSwitchVal;
                }
            }
        }


        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+", ");
        }


        System.out.println(" =========== ");
        //prime
        int toTest=25;
        int count=2;
        while (toTest%count!=0)
            count++;
        System.out.println(toTest==count?"Jest":"nie jest");
        System.out.println(" =========== ");

        //fibonacci
        int number=4;

        //ta która szybciej umiera dostaje wartość 1.
        //x 1 2 3 4 5 6 7
        //y 1 1 2 3 5 8 13
        int i1=1;
        int i2=0;
        int sum=0;
        for (int i = 0; i < number; i++) {
            sum=i1+i2;
            i1=i2;
            i2=sum;
        }
        System.out.println(sum);


    }
}