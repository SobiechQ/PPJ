package W11.W11_0_CW1.CW1;

public class Phrase {
    String[] arr = new String[100];
    int arrIndex=0;
    public void addWordAtEnd(String word) {
        this.arr[this.arrIndex++] = word;
    }
    public void show(){
        for (int i = 0; i < this.arrIndex; i++) {
            System.out.print(this.arr[i]+" ");
        }
    }
}
