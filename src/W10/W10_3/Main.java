package W10.W10_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i =0; i < arr.length; i++)
            arr[i]= (int) (Math.random()*10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleStort(arr, arr.length)));
    }
    public static int[] bubbleStort(int[] arr, int toSort){
        int tmp;
        if(toSort<=1){
            return arr;
        }
        for (int i = 1; i < toSort; i++) {
            if(arr[i]<arr[i-1]){
                tmp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=tmp;
            }
        }
        return bubbleStort(arr, toSort-1);
    }
}
