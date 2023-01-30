package W13.W13_6;

public class Ludzie {
    protected String name;
    protected int wartoscStatyczna=8;
    public Ludzie(String name){
        this.name = name;
    }
    protected String getData(){
        return "Człowiek: "+this.name;
    }
    public String czyJestCzlowiekiem(){
        return "tak";
    }
    protected void czyZdam(){
        System.out.println("Nie");
    }
}
