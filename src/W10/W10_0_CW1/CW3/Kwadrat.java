package W10.W10_0_CW1.CW3;

public class Kwadrat {
    private int bok;
    Kwadrat(int bok){
        this.bok=bok;
    }
    public void draw(){
        System.out.println("Pole pow: "+Math.pow(this.bok,2)+", "+"Objetosc szescianu: "+Math.pow(this.bok, 3));
    }

}
