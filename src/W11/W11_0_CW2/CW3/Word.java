package W11.W11_0_CW2.CW3;

public class Word {
    String current;
    Word next;

    public Word(String current) {
        this.current = current;
    }

    public Word getNext() {
        return next;
    }

    public void setNext(Word next) {
        this.next = next;
    }
}
