package W11.W11_0_CW2.CW4;

public class Ostroslup extends Trojkat{
    Ostroslup(int bok) {
        super(bok);
    }
    public void printVolume(){
        System.out.println((Math.pow(this.getBok(),3)*Math.sqrt(2))/12);
    }



}
