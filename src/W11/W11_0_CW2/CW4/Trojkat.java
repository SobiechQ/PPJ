package W11.W11_0_CW2.CW4;

public class Trojkat {
    private int bok;
    Trojkat(int bok){
        this.bok=bok;
    }
    public void printArea(){
        System.out.println((Math.pow(this.bok,2)*Math.sqrt(3))/4);
    }
    public double getArea(){
        return (Math.pow(this.bok,2)*Math.sqrt(3))/4;
    }

    public int getBok() {
        return bok;
    }
}
