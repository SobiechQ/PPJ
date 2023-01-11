package W12;

public class Student
        extends Person
    {
    int jestWObu=20;
    //extends Person bo po nim dziedziczy
//    String name;
//    int birthYear;
    //moge usunąć więc nazwe i rok urodzenia,
    //klasa bardziej wyspecjalizowana (klasa pochodna)
    protected int sNumber;
    public void getOba(){
        System.out.println("z klasy student ("+this.jestWObu+"), Z klasy person ("+super.jestWObu+")");
        //Super pozwala odwołać si e doo składników widocznych w jej klasie bazowej.
    }
    public void draw(){
        super.draw();
        System.out.print("Numer stud: "+this.sNumber+".");
    }
    public void getTyp(){
        System.out.println("Student");
    }
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(this == obj)
            return true;
        //if(obj.sNumber==this.sNumber) Mie można bo
        //object nie wie nic o metodach studenta
        if(!(obj instanceof Student))
           return false;

        Student s = (Student) obj;
        if(this.sNumber==s.sNumber &&
                this.birthYear==s.birthYear &&
                this.name == s.name){
            return true;
        }


        return false;
    }
}
