package W13.W13_5;

public class Square extends Shape{

    public Square(int size) {
        super(size, Shape.SQUARE);
    }
    public double getArea(){
        return Math.pow(super.getSize(),2);
    }
    public String getData(){
        return super.getData()+"\n figura ta jest kwadratem i ma pole równe: "+this.getArea();
    }
}
