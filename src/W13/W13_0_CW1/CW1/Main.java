package W13.W13_0_CW1.CW1;

public class Main {
    public static void main(String[] args) {
        int input;
        do{
            input = getValueFromUser();
            if(input==0){
                cls();
                continue;
            }
            for(int i=31; i>=0; i--) {
                if ((i+1)% 4 == 0)
                    System.out.print("|");
                System.out.print(
                        (input & (0b1 << i)) == 0 ? "0" : "1"
                );
            }
            System.out.println(" ");

            System.out.println(Integer.toOctalString(input));
            for (int i=0; i<=29; i+=3) {
                System.out.println(input+" >> "+i+", "+" = "+(input>>i)+", bit: "+Integer.toBinaryString((input>>i))+", oct: "+((input>>i)&0b111));
            }
            System.out.println(" ");
            for (int i = 32; i >=0 ; i-=4) {
                System.out.println(input+" >> "+i+", "+" = "+(input>>i)+", bit: "+Integer.toBinaryString((input>>i))+", hex: "+((input>>i)&0b1111));
                String val = switch ((input>>i)&0b1111){
                    case 10->"A";
                    case 11->"B";
                    case 12->"C";
                    case 13->"D";
                    case 14->"E";
                    case 15->"F";
                    default -> Integer.toString(input);
                };
//                System.out.print(val);
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
        java.util.Scanner scanner = new java.util.Scanner(System.in);
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