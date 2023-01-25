package W13.W13_5;

public class Element {
    private Element next;
    private Shape current;

    Element(Shape shape){
        this.current=shape;
        this.current=this.current.getShapedObject();
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Shape getCurrent() {
        return current;
    }
}
