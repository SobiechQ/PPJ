package W13.W13_4;

public class Element {
    Person currentStudent;
    Element next;
    Element(String name, String sNumber){
        this.currentStudent =new Student(name, sNumber);
    }
    Element(String name){
        this.currentStudent=new Person(name);
    }
}
