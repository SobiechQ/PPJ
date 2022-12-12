package W08;

public class Main2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,20,10};
        boolean out=true;
        int iLeft=arr.length%2==0?(arr.length-1)/2: arr.length/2;
        int iRight=arr.length%2==0?iLeft+1:iLeft;
        while (iLeft>0&&out){
            if(arr[iLeft]!=arr[iRight])
                out=false;
            iLeft--;
            iRight++;
        }
        System.out.println(out);
    }
}
