package W10.W10_7;

public class MyList {
    Element head;
    public void add(Cookie cookie){
        if(this.head==null){
            this.head = new Element(cookie);
        } else {
            Element tmp = new Element(cookie);
            tmp.setNext(this.head);
            this.head=tmp;
        }
    }
    public void show(){
        Element tmp = this.head;
        while (tmp!=null){
            tmp.show();
            tmp=tmp.getNext();
        }
    }
}
