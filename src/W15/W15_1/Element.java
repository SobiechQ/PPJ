package W15.W15_1;

public class Element {
    private Element next;
    private Person current;
    private static int count=0;

    protected Element(String input){
        this.current = new Person(input);
        Element.count++;
    }

    protected Element getNext() {
        return next;
    }

    protected void setNext(Element next) {
        this.next = next;
    }

    public void setCurrent(Person current) {
        this.current = current;
    }

    public Person getCurrent() {
        return current;
    }
    public static int length(){
        return count;
    }
}
