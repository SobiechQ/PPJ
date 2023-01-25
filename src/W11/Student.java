package W11;

public class Student
        extends Person{
    int jestWObu=20;
    //extends Person bo po nim dziedziczy
//    String name;
//    int birthYear;
    //moge usunąć więc nazwe i rok urodzenia,
    //klasa bardziej wyspecjalizowana (klasa pochodna)
    protected int sNumber;
    public void getOba(){
        System.out.println("z klasy student ("+jestWObu+"), Z klasy person ("+super.jestWObu+")");
        //Super pozwala odwołać si e doo składników widocznych w jej klasie bazowej.
    }
    public void draw(){
        super.draw();
        System.out.print("Numer stud: "+this.sNumber+".");
    }
}
