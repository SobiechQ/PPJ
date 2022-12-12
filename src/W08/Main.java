package W08;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Hello world!");
            for (int i = 0; i < 10; i++) {
                change(5);
                fill++;
            }
            System.out.println(Arrays.toString(arr));
        }
        //rekurencja();

        System.out.println(fibonachi(100));
    }


    //zmienna co ja widac wszedzie
    public static int fill=0;
    public static int[] arr=new int[5];
    public static void change(int input){
        if(fill<arr.length){
            arr[fill]=input;
        }
    }

    //różnią się SYGNATURĄ
    public static int sum(int i1, int i2){
        return 0;
    }
    public static int sum(int i1, int i2, int i3){
        return 0;
    }

    //jak sie ma metode z longiem i z dablem a poda sie char to wywyoła się taa z longiem.
    //w powyzszej sytuacji nie da sie podac booleana jako argument (Jeżeli nie stworzono przeciazenia z booleanem)

    //w stytuacji gdy jest metoda z shortem to wywolanie metody z intem I TAK WYWYLA TA Z INEM
    //dzieje sie tak bo short mimo ze jest 2 Bajtowy nie przyjmuje wartosci ujemnych.

    //====================
    //jak sa metody (double,int)
    //oraz (int,double)
    //a podamy dwa razy inta to moze podac do obu. Dlatego jest error.
    //==============================
    public static int ile=0;
    public static void rekurencja(){
        System.out.println((ile++));
        rekurencja();

        //przykład rekurencji
        //stack overflow error

        //przeciążenie stosu
        //stos jest lifo
        //last in first out
        //filo też działa

        //inną operacją jest położenie czegoś na stosie a inną jest zdjęcie czegoś ze stosu.

        //push i pop.
        //jak kładziemy coś na stos to push
        //jak chcemy pobrać to robimy POP


        //pocwicz rekurencje
        //jak schodzi z studu dzieje sie magia?
        //rekurencja co sie jede 3 razy a POTEM printuje println???????

        //dziwne rzeczy
    }

    public static long fibonachi(long input){
        //zrob to na rekurencji
        return 0;
    }



}