package W08;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+(int) (Math.random()*3);
        }
        System.out.println("Input: "+ Arrays.toString(arr));
        //============================================================
        int ileRazy;
        int[] ileRazyTMP=new int[2];
        //{[jaka cyfra],[ile razy]};
        for (int arrI:arr) {
            ileRazy=0;
            for (int arrITimes:arr) {
                if(arrI==arrITimes)
                    ileRazy++;
            }
            if(ileRazy>ileRazyTMP[1]){
                ileRazyTMP[0]=arrI;
                ileRazyTMP[1]=ileRazy;
            }
        }
        System.out.println(Arrays.toString(ileRazyTMP));
    }
}
