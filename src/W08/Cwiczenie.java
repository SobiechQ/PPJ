import java.util.Arrays;
import java.util.Scanner;

public class Cwiczenie {
    public static void main(String[] args) {
        int size=5;
        int arr[][]=new int[size][size];
        int errorTimes=0;
        while (errorTimes<20){
            int x=(int)(-(0.2*size)+Math.random()*(1.4*size));
            int y=(int)(-(0.2*size)+Math.random()*(1.4*size));
            if(x<0||x>size-1||y<0||y>size-1){
                System.out.println("Coordinates outside of array range("+x+", "+y+")");
                errorTimes++;
            }
        }
    }
}
