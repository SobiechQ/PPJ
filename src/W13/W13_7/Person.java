package W13.W13_7;

import java.util.Objects;

public
    class Person
    extends Object{

    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void show(){
        System.out.println(
            "Person: name("+this.name+") "
            +"birthYear("+this.birthYear+")"
        );
    }

    public String toString(){
        return "Person( "+this.name+" "+this.birthYear+")"
                + super.toString();
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if( !(obj instanceof Person))
            return false;

        Person p = (Person) obj;
        return
             this.birthYear == p.birthYear
             && this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
