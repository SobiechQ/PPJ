package W11;

public class Main {
//    int tmp;
//    public void met(){
//        class A{
//            int tmp;
//            public void met(){
//                Main.this.tmp=7;
//                //odwołuje sie do inta w Main
//                this.tmp=10;
//                //odwołuje sie do tmp należącego do klasy A.
//
//            }
//        }
//    }
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        System.out.println(person.toString());
        System.out.println(student.toString());
        //METODA to string istnieje poniważ KAŻDA KLASA DZIEDZITY PO KLASIE Object
        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println("===================================");
//=================================================
        student.drawName();
        //w Student nie ma, jest w Person więc wykonuje sie ta z Person.
        student.getOba();
        person.draw();
        student.draw();

    }
}
