package W12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Polimorfizm.
        /*
        Odnośnikowi klasowamu pożna przypisać
        odniesienie nie tylko do obiektu jego w klasy pochodnej
        (rozumiem, że rodzica)
        rodzica
         */
        /*
        W Javie wywołanie metody jest determinowane przez typ obiektu,
        na rzecz którego nastąpiło wywołanie.
         */

        //Do obiektu klasy bazowej przypisać można obiekt klasy dziedziczącej.
        Person person = new Student();
        Person[] people ={
                new Person(),
                new Student(),
                person
        };
        for (Person i :
                people) {
            System.out.println(" ");
            i.getTyp();
        }
        Object[] objects = {
                new Person(),
                new Person(),
                new Person(),
                new Student()
        };
        //objects[0].getTyp; Nie działa.
        System.out.println(objects[0].getClass());

        //oba robią to samo, toString jest doomyślną metodą.
        System.out.println(objects[0]);
        System.out.println(objects[0].toString());
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1 == s2); // false bo adresy
        System.out.println(s1.equals(s2)); //też false, ale dla czego?
        //Dlatego że też prównuje adresy, można to stwierdzić patrząc
        //debuggeem wewnątrz metody.
        // teraz już true, bo Student otrzymał metodę equals.
        try{
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(objects[55]);
            System.out.println("To sie nie wykona");
        } catch (ArrayIndexOutOfBoundsException e){
            //podaje miejsce błędu.
            e.printStackTrace();
        }
        //throw pozwala nam podnoszenie własnych wyjątków.

        //Wyjątki
        /*
        Podnoś tylko jak jest problem
        przechwytuj gdy możesz go ozbsłużyć
        nie ignoruj wyjątku, przynajmniej printStack
        Wyjąttki adekwatne do problemu (NIe te same nazwy)
         */

    }
}
