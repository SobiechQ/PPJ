package W13.W13_0_CW2.CW2;

public class MyListOfPNW {
    String head;
    MyListOfPNW next;

    public MyListOfPNW() {
    }

    public void printList(){
        MyListOfPNW tmp = this;
        do{
            System.out.println(tmp.head);
            tmp = tmp.next;
        }while (tmp!=null);
    }

    public void addToList(String input){
        if(this.head==null) {
            this.head = input;
            return;
        }
        MyListOfPNW tmp = this;
        while (tmp.next!=null)
            tmp=tmp.next;
        tmp.next=new MyListOfPNW();
        tmp=tmp.next;
        tmp.head=input;
    }
}
