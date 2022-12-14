package W10.W10_0_CW1.CW4;

public class Walec {
    private int promien;
    private int wysokosc;
    Walec(int promien, int wysokosc){
        this.promien=promien;
        this.wysokosc=wysokosc;
    }
    public void draw(){
        System.out.println("Pole powierzchni podstawy wynosi: "+Math.PI*Math.pow(this.promien,2)+" a objetosc walca wynosi: "+Math.PI*Math.pow(this.promien,2)*wysokosc);
    }
}
