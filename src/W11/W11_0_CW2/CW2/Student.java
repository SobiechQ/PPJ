package W11.W11_0_CW2.CW2;

public class Student {
    String name;
    int sNumebr;
    public Student(String name, int sNumebr) {
        this.name = name;
        this.sNumebr = sNumebr;
    }
    public void show(){
        System.out.println("Student: ("+this.name+")   ma eske: ("+this.sNumebr+")");
    }

}
