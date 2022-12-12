package W10;

public class Ciastko {
    int waga;
    String skladnik;
    Ciastko(String input){
        this.waga= (int) (10+Math.random()*10);
        this.skladnik=input;
    }
    public void draw(){
        System.out.println(this.waga+" "+this.skladnik);
    }
}
