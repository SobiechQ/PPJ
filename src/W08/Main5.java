package W08;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+(int) (Math.random()*3);
        }
        System.out.println("Input: "+ Arrays.toString(arr));
        //===============================================================
        System.out.print(arr[0]+", ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]!=arr[i]){
                System.out.print(arr[i]+", ");
            }
        }



    }
}
