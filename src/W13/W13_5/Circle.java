package W13.W13_5;

public class Circle extends Shape{
    public Circle(int size) {
        super(size, Shape.CIRCLE);
    }
    public double getArea(){
        return (Math.pow(super.getSize(),2)/2)*Math.PI;
    }
    public String getData(){
        return super.getData()+"\n figura ta jest kołem i ma pole równe: "+this.getArea();
    }
}
