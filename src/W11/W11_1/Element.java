package W11.W11_1;

public class Element {
    Element next;
    Block current;
    Element(Block inputBlock){
        this.current = inputBlock;
    }
    public void setNext(Element inputElement){
        this.next = inputElement;
    }

    public Element getNext() {
        return next;
    }
}
