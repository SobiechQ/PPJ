package W13.W13_5;

public class Triangle extends Shape{

    public Triangle(int size) {
        super(size, Shape.TRIANGLE);
    }
    public double getArea(){
        return (Math.pow(super.getSize(),2)*Math.pow(1,(1f/3f)))/3f;
    }
    public String getData(){
        return super.getData()+"\n figura ta jest trojkatem i ma pole równe: "+this.getArea();
    }
}
