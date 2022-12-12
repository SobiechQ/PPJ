package W08;

import java.util.Arrays;

public class Zadanie {
    public static void main(String[] args) {
        int[] arr1=new int[3+(int)(Math.random()*3)];
        int[] arr2=new int[3+(int)(Math.random()*3)];
        int[] arr3=new int[3+(int)(Math.random()*3)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=(int)(Math.random()*10);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=(int)(Math.random()*10);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=(int)(Math.random()*10);
        }
        System.out.println("Input 1: "+ Arrays.toString(arr1));
        System.out.println("Input 2: "+ Arrays.toString(arr2));
        System.out.println("Input 3: "+ Arrays.toString(arr3));
        int[][] output=new int[3][];
        output[0]=arr1;
        output[1]=arr2;
        output[2]=arr3;
        for (int i = 0; i < output.length; i++) {
            System.out.println("Output :"+Arrays.toString(output[i]));
        }

    }
}
