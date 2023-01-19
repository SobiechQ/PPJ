package W13.W13_0_CW1.CW1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        int input=-1;
        do{
            input = getValueFromUser();
            if(input==0){
                cls();
                continue;
            }


            for(int i=31; i>=0; i--)
                System.out.print(
                        ( input & (0b1 << i)) == 0 ? "0" : "1"
                );
            System.out.println(" ");

            for (int i=0; i<=31; i+=3) {
                System.out.print(
                       input&(0b111 << i)
                );
            }
            System.out.println(" ");

        }while (input!=-1);
    }






    public static void cls(){
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }
    public static int getValueFromUser(){
        int output = 0;
        boolean noError=true;
        do {
            String tmpOut = scanner.next();
            try {
                output = Integer.parseInt(tmpOut);
                if(output<0)
                    throw new NumberFormatException();
                noError=false;
            } catch (NumberFormatException e) {
                System.out.println("Podany znak nie jest liczą całkowitą większą od zera");
            }
        } while (noError);
        return output;
    }
}
