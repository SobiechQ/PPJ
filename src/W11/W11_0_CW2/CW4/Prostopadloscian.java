package W11.W11_0_CW2.CW4;

public class Prostopadloscian extends Prostokat{
    private int zAxis;
    public Prostopadloscian(int xAxis, int yAxis, int zAxis) {
        super(xAxis, yAxis);
        this.zAxis = zAxis;
    }
    public void printVolume(){
        System.out.println(super.getArea()*this.zAxis);
    }
}
