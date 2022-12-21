package W11.W11_0_CW1.CW1;

public class Main {
    public static void main(String[] args) {
        //sposób pierwszy:
        Phrase phrase = new Phrase();
        phrase.addWordAtEnd("Slowko");
        phrase.addWordAtEnd("hihuhehy");
        phrase.addWordAtEnd("pjatk");
        phrase.show();
        phrase.addWordAtEnd("ABCD");
        phrase.show();
        System.out.println("   ");
        //sposób drugi:
        MyList myList = new MyList();
        myList.addWord("raz");
        myList.addWord("dwa");
        myList.addWord("trzy");
        myList.addWord("cztery");
        myList.addWord("piec");

        myList.show();
    }
}
