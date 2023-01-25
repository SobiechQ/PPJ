package W13.W13_7;

import java.util.Objects;

public
    class Student
    extends Person {

    protected int sNumber;

    public Student(
        String name, int birthYear, int sNumber
    ) {
        super(name, birthYear);
        this.sNumber = sNumber;
    }

    public void show(){
        super.show();
        System.out.println(
            "Student: sNuber("+this.sNumber+")"
        );
    }

    public void fun(){

    }

    @Override
    public String toString(){
        return "Student( "+this.sNumber+")"
            + super.toString();
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if( !(obj instanceof Student))
            return false;

        Student s = (Student) obj;
        if (
            this.sNumber == s.sNumber
            && super.equals(obj)
        )
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sNumber);
    }
}
