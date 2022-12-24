package W11.W11_0_CW2.CW2;

public class MyStackList {
    Element head;
    int maxStackSize;
    int currentStackSize;
    public MyStackList(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }
    public void push(String name, int sNumber){
        if(this.currentStackSize<this.maxStackSize) {
            if (this.head == null) {
                this.head = new Element(name, sNumber);
            } else {
                Element tmp = this.head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = new Element(name, sNumber);
            }
            this.currentStackSize++;
        } else {
            System.out.println("Metoda push nie wykonała się, osiągnięto maksymalny rozmiar stosu");
        }
    }
    public void pop(){
        if(this.head!=null){
            Element tmp=this.head;
            while (tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.printCurrent();
            Element removeElementFromStack = tmp;
            tmp=this.head;
            while (tmp.next!=removeElementFromStack&&tmp.next!=null){
                tmp=tmp.next;
            }
            if(tmp.next==null){
                this.head=null;
            }
            tmp.next=null;
            this.currentStackSize--;
        } else {
            System.out.println("Metoda pop nie wykonała się, koniec stosu");
        }

    }
}
