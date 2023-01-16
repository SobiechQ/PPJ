package w2;

public class Rocket{
    String name;
    int fullWeight;
    public Rocket(String name, int fullWeight) {
        this.name = name;
        this.fullWeight = fullWeight;
    }
    public void refill(){
        this.fullWeight+=(Math.random()*1000);
    }
    public void start() throws LowFullExeption{
        if(this.fullWeight<1000)
            throw new LowFullExeption();
    }
}
