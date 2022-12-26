package W11.W11_0_CW2.CW4;

public class Prostokat {
    private int xAxis;
    private int yAxis;
    public Prostokat(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    public void printArea(){
        System.out.println(this.xAxis*this.yAxis);
    }
    public int getArea(){
        return this.xAxis*this.yAxis;
    }

}
