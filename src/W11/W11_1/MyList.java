package W11.W11_1;

public class MyList {
    Element tmp;
    public void addBlock(int i){
        if(tmp==null)
            tmp = new Element(new Block(i));
        else {
            tmp.setNext(tmp);
            tmp = new Element(new Block(i));
        }
    }
    public void getBlock(){
        while (this.tmp!=null){
            tmp.current.drawPos();
            tmp = tmp.getNext();
        }
    }
}
