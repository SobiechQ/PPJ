package W15.W15_6;

public class Element {
    private char graphic;
    private int index;
    private Element nextElementX;
    private Element nextElementY;
    Element(int index){
        this(null,index);
    }
    Element(Element input,int index){
        this.setNextElementY(input);
        this.index=index;
    }
    public char getGraphic() {
        return '1';
    }

    public int getIndex() {
        return index;
    }

    public Element getNextElementX() {
        return this.nextElementX;
    }
    public Element getNextElementY() {
        return this.nextElementY;
    }
    public void setGraphic(char graphic) {
        this.graphic = graphic;
    }
    public void setNextElementX(Element nextElementX) {
        this.nextElementX = nextElementX;
    }
    public void setNextElementY(Element nextElementY) {
        this.nextElementY = nextElementY;
    }
}
