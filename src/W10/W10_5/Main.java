package W10.W10_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(fiboR(10));
        int x=1;
        double y=(byte)1;
        przeciazenie(x, y);
    }
    public static void przeciazenie(byte i){
        System.out.println("byte");
    }
    public static void przeciazenie(int i){
        System.out.println("int");
    }
    public static void przeciazenie(short i){
        System.out.println("short");
    }


    public static void przeciazenie(char i){
        System.out.println("char");
    }
    public static void przeciazenie(int i, double j){
        System.out.println("int double");
    }
    public static void przeciazenie(int i, float j){
        System.out.println("int float");
    }
    public static void przeciazenie(float i, int j){
        System.out.println("int float");
    }





    public static long fiboR(long n){
        if (n==0||n==1){
            return n;
        }
        return fiboR(n-1)+fiboR(n-2);
    }
}
