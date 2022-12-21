package W11.W11_0_CW1.CW1;

public class MyList {
    Element head;

    public void addWord(String word){
        if(this.head==null){
            this.head=new Element(new Word(word));
        } else {
//            Element tmp = new Element(new Word(word));
//            tmp.next=this.head;
//            this.head=tmp;
            Element tmp = new Element(new Word(word));
            Element tmpH = this.head;
            while (tmpH.next!=null){
                tmpH = tmpH.next;
            }
            tmpH.next=tmp;
        }
    }
    public void show(){
        while (this.head!=null){
            System.out.println(head.current.word);
            this.head = this.head.next;
        }
    }
}
