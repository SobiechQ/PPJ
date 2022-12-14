package W10.W10_0_CW1.CW2;

public class Fruit {
    String name;
    double weight=0.5+(Math.random()*0.3);
    Fruit(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(this.name+" "+this.weight);
    }
}
