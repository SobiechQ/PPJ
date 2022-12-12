package W10;
public class Storage {
    Ciastko[] ciastkos = new Ciastko[100];
    int ciastkoCount=0;
    public void make(String input){
        this.ciastkos[this.ciastkoCount++] = new Ciastko(input);
    }
    public void add(Ciastko input){
        this.ciastkos[this.ciastkoCount++]=input;
    }
    public void draw(){
        for (int i = 0; i < this.ciastkoCount; i++) {
            System.out.print(ciastkos[i].skladnik+", "+ciastkos[i].waga);
            System.out.println(" ");
        }
    }
}
