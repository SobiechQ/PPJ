package W13.W13_0_CW2.CW1;

public class Main {
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner(System.in);
        /*

            PROSZE SIE TYM NIE SUGEROWAC
            PROGRAM NAPISANY JEST TRAGICZNIE JA O TYM WIEM

         */
        try {
            System.out.println(myScanner.readPosIntegerNumber());
        } catch (Exception e) {
            System.out.println("Liczba nie jest dodatnia");
        }

    }
}
