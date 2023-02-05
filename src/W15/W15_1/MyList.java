package W15.W15_1;

public class MyList {
    private static Element head;
    private static Element tail;

    public static void add(String input){
        if(MyList.head==null){
            MyList.tail = MyList.head = new Element(input);
            return;
        }
        MyList.tail.setNext(new Element(input));
        MyList.tail=MyList.tail.getNext();
    }
    public static void show(){
        Element tmp = MyList.head;
        if(tmp == null)
            return;
        do {
            System.out.println(MyList.getName(tmp));
            tmp = tmp.getNext();
        } while (tmp!=null);

    }

    public static void shuffle(){
        Element tmpHead = MyList.head;

        for (int i = 0; i < Element.length(); i++) {
            Element shuffleHead = MyList.head;
            int headIndex = 0;
            while (headIndex!=i){
                headIndex++;
                shuffleHead=shuffleHead.getNext();
            }

            int tailIndex = (int) (Math.random()*(Element.length()-1));

            Element[] elementsTail = new Element[Element.length()-1];


            int elementsTailIndex=0;
            Element tmpTail = MyList.head;

            for (int j = 0; j < Element.length(); j++) {
                if(j!=headIndex){
                    elementsTail[elementsTailIndex++]=tmpTail;
                }
                tmpTail=tmpTail.getNext();
            }

            System.out.println(getName(shuffleHead) + " oraz: " + getName(elementsTail[tailIndex]));

            Person tmpSwitch = shuffleHead.getCurrent();
            shuffleHead.setCurrent(elementsTail[tailIndex].getCurrent());
            elementsTail[tailIndex].setCurrent(tmpSwitch);




        }











    }



    private static String getName(Element tmp){
        return tmp.getCurrent().getName();
    }

}
