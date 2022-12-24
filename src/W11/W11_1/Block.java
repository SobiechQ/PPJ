package W11.W11_1;

public class Block {
    boolean state=false;
    int xAxis;
    int yAxis;
    Block(int i){
        this.xAxis = i;
    }


    public void drawPos(){
        System.out.print(" ["+this.xAxis+", "+this.yAxis+"] ");
    }
}
