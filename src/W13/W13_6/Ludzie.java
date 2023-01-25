package W13.W13_6;

public class Ludzie {
    protected String name;
    public Ludzie(String name){
        this.name = name;
    }
    public String getData(){
        return "Człowiek: "+this.name;
    }
    public String czyJestCzlowiekiem(){
        return "tak";
    }
}
