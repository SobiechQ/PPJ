package W13.W13_4;


public class Student extends Person {
    private String sNumber;
    Student(String name, String sNumber){
        super(name);
        this.sNumber=sNumber;
    }
    public String getData() {
        return "Student: "+super.getName()+" ma numer: "+this.sNumber;
    }
}
