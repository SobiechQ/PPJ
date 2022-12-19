package W10.W10_7;

public class Element {
    Cookie data;
    Element next;
    Element(Cookie cookie){
        this.data = cookie;
    }
    public void setNext(Element next){
        this.next = next;
    }
    public void show(){
        System.out.println(this.data.waga);
    }
    public Element getNext() {
        return this.next;
    }
}
