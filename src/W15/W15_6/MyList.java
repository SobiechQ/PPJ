package W15.W15_6;

public class MyList {
    public static int length = 10;
    private static final Element head = new Element(length++);
    private static Element tmp = head;
    public static void addElementX(int posY){
        resetTmp();
        //set tmp as 0th element of posY row.
        for (int i = 0; i < posY; i++) {
            if (tmp.getNextElementY()==null){
                addElementY();
                return;
            }
            tmp=tmp.getNextElementY();
        }
        Element yListNextElementTmp = tmp.getNextElementY();
        while (tmp.getNextElementX()!=null)
            tmp=tmp.getNextElementX();
        tmp.setNextElementX(new Element(yListNextElementTmp, length++));
        resetTmp();
    }
    public static void addElementY(){
        resetTmp();
        while (tmp.getNextElementY()!=null)
            tmp=tmp.getNextElementY();
        tmp.setNextElementY(new Element(length++));
        //Set Y pointers from previous row into new object.
        Element yListNextElementTmp = tmp.getNextElementY();
        while (tmp!=null) {
            tmp.setNextElementY(yListNextElementTmp);
            tmp = tmp.getNextElementX();
        }
        resetTmp();
    }
    public static void addElementSquare(int posY, int posX){
        resetTmp();
        for (int i = 0; i <= posY; i++) {
            int yListLength=0;
            do{
                tmp=tmp.getNextElementX();
                yListLength++;
            }while (tmp!=null);

            for (int j = 0; j < posX-yListLength; j++) {
                addElementX(i);
                //todo nowe pointery wskazują na początek listy
            }
            if(tmp.getNextElementY()==null)
                addElementY();
            tmp.getNextElementY().getIndex();
            tmp=tmp.getNextElementY();

        }
        resetTmp();
    }
    public static void draw(){
        resetTmp();
        while (tmp!=null){
            while (tmp.getNextElementX()!=null){
                System.out.print(" " + tmp.getIndex());
                tmp = tmp.getNextElementX();
            }
            System.out.println(" " + tmp.getIndex());
            tmp=tmp.getNextElementY();
        }
        resetTmp();
    }
    public static Element getElementByPos(int posY, int posX){
        resetTmp();
        if(posY<0||posX<0)
            return null;
        for (int i = 0; i < posY; i++) {
            if (tmp==null){
                return null;
            }
            tmp = tmp.getNextElementY();
        }
        for (int i = 0; i < posX; i++) {
            if (tmp==null){
                return null;
            }
            tmp = tmp.getNextElementX();
        }
        Element output = tmp;
        resetTmp();
        return output;
    }
    private static void resetTmp(){
        tmp=head;
    }
}
