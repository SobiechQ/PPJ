package W13.W13_4;

public class MyStackList {
    Element head;
    public void push(String name, String sNumber){
        if(this.head==null)
            this.head = new Element(name, sNumber);
        else {
            Element tmp = this.head;

            while (tmp.next!=null) {
                tmp=tmp.next;
            }
            tmp.next = new Element(name, sNumber);

        }
    }
    public void push(String name){
        if(this.head==null)
            this.head = new Element(name);
        else {
            Element tmp = this.head;

            while (tmp.next!=null) {
                tmp=tmp.next;
            }
            tmp.next = new Element(name);

        }
    }
    public void show(){
        if(this.head==null) {
            System.out.println("Brak elementów w liście");
            return;
        }
        Element tmp = this.head;
        do{
            System.out.println(tmp.currentStudent.getData());
            tmp=tmp.next;
        }while (tmp!=null);
    }
    public void pop(){
        if(this.head==null) {
            System.out.println("Brak elementów w liście");
            return;
        }
        if(this.head.next==null){
            System.out.println(this.head.currentStudent.getData());
            this.head=null;
            return;
        }


        Element tmp = this.head;
        while (tmp.next.next!=null){
            tmp=tmp.next;
        }
        System.out.println(tmp.next.currentStudent.getData());
        tmp.next=null;
    }
}
