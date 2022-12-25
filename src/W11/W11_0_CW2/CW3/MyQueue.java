package W11.W11_0_CW2.CW3;

public class MyQueue {
    Word head;
    public void put(String input){
        if(this.head==null){
            this.head=new Word(input);
        } else {
            Word tmp = this.head;
            while(tmp.next!=null)
                tmp = tmp.next;
            tmp.next=new Word(input);
        }
    }
    public void get(){
        Word tmp = this.head;
        System.out.print(tmp.current);
        this.head=this.head.next;
    }
}
