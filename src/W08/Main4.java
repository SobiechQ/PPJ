package W08;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=1;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=arr[i]+(int)(Math.random()*2.5);
        }
        System.out.println("Input: "+Arrays.toString(arr));

        int[] output=new int[arr.length];
        int indexOutput=0;
        for (int j : arr) {
            if (!czyWartoscJestWtablicyArr(j, output)) {
                output[indexOutput] = j;
                indexOutput++;
            }
        }
        System.out.print("Output: Jest "+indexOutput+" Różnych cyfr. -> ");
        for (int i = 0; i < indexOutput; i++) {
            System.out.print(output[i]+", ");
        }
    }

    public static boolean czyWartoscJestWtablicyArr(int input, int[] arr){
        int ileRazyJest=0;
        boolean output=false;
        for (int i : arr) {
            if (i == input) {
                ileRazyJest++;
            }
            if (ileRazyJest > 0)
                output = true;
        }
        return output;
    }

}