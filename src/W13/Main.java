package W13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
            Operacje bitowe.
         */
        {
            int val = 0b1010;
            System.out.println(val+" << 2 ="+(val << 2));
            System.out.println(val+" >> 2 ="+(val >> 2));
            // znak >> dodaje jako MSb znak MSb (wartości najstarszego bitu).
            val = 0b11111111_11111111_11111111_11111111; //-1
            System.out.println(val);
            for (int i = 31; i >= 0; i--) {
                System.out.print(
                        (val&(0b1<<i))==0?"0":1
                );
            }
        }
        /*
            Operacje wejścia wyjścia.
            Strumień jest reprezentacją uporządkowanego zbioru danych do
            którego można uzystakć dostęp w kolejości sekwencyjnej.

            jeżeli wchodzi a,b,c trzeba wczytać najpier a potem b potem c.
            nie można w innej kolejności.

            Ze względu na przetwarzane dane można je rozróżnić na:
            - Znakowe.
            - Bitowe.
         */
        System.out.println(" ");
        System.out.println("===========================");
        File file = new File("C:\\Users\\Sobiech\\Documents\\PPJ\\src\\W13\\1.txt");
        try{
            FileReader fileReader= new FileReader(file);

            //tańsza opcja niż dodawanie stringów.
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder stringBuilder = new StringBuilder();

            int tmp = fileReader.read();
            while (tmp!=-1){
                System.out.print((char)tmp);
                stringBuffer.append((char)tmp);
                tmp = fileReader.read();
            }
            fileReader.close();
            System.out.println(" ");

            //pozwala tworzyć Stringa na zasadzie kolejnych liter metodą append.
            System.out.println("Stringiem jest: "+stringBuffer.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //można to samo zrobić Scannerem.

        /*
            Kiedy ze scanera a kiedy z readera
            scanner jest bardziej zaawansowany, ale też bardziej kosztowny.

            FileReader po prostu wczytuje informacje i przechowuje w postaci zmiennej tmp.
         */


        try {
            //dobry do tekstu. Zapisuje mało bitów na raz więc duże luczby będą potraktowane jakoś dziwnie.
            FileWriter fw = new FileWriter("C:\\Users\\Sobiech\\Documents\\PPJ\\src\\W13\\1.txt");
            fw.write("DODANO!");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }






        int zaDuzaLiczba = 160000000;
        try {
            FileOutputStream fos = new FileOutputStream(
                    new File("C:\\Users\\Sobiech\\Documents\\PPJ\\src\\W13\\1.txt")
            );

            //niby to ma działać ale nie działa xD
            fos.write(zaDuzaLiczba);
            fos.write(zaDuzaLiczba<<8);
            fos.write(zaDuzaLiczba<<16);
            fos.write(zaDuzaLiczba<<24);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        try {
            FileInputStream fis = new FileInputStream(
                    new File("C:\\Users\\Sobiech\\Documents\\PPJ\\src\\W13\\1.txt")
            );
            //to niby powinno wczytywać ale cos nie jest tak jak ba być xD
            int oct1 = fis.read();
            int oct2 = fis.read();
            int oct3 = fis.read();
            int oct4 = fis.read();
            fis.close();

            System.out.println(
                    oct1 | (oct2 << 8) | (oct3 << 16) | (oct4 << 24)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}






















