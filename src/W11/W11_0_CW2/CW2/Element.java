package W11.W11_0_CW2.CW2;

public class Element {
    Element next;
    Student current;
    Element(String name, int sNumber){
        current = new Student(name, sNumber);
    }

    public void printCurrent() {
        this.current.show();
    }
}
