package W11.W11_0_CW2.CW4;

public class Graniastoslup extends Trojkat{
    private int zAxis;
    Graniastoslup(int bok, int zAxis) {
        super(bok);
        this.zAxis=zAxis;
    }
    public void printVolume(){
        System.out.println(super.getArea()*this.zAxis);
    }
}
