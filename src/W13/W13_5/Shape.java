package W13.W13_5;

public class Shape {
    //TODO Final musi byc zainicjowany!!! (ALbo w klasie albo w konstruktorze). FINAL STATIC musi być w klasie zainicjowany
    public static final int TRIANGLE = 0b1;
    public static final int SQUARE = 0b10;
    public static final int CIRCLE = 0b100;
    private final int size, shape;
    public Shape(int size, int shape) throws IllegalStateException{
        if(!(shape==TRIANGLE||shape==SQUARE||shape==CIRCLE))
            throw new IllegalArgumentException("Argument can be: Triangle, Square or Circle");
        this.size = size;
        this.shape = shape;
    }
    public Shape getShapedObject(){
        return switch (this.shape){
            case 0b1: yield new Triangle(this.size);
            case 0b10: yield new Square(this.size);
            case 0b100: yield new Circle(this.size);
            default: throw new IllegalStateException("Illegal shape");
        };
    }
    public int getSize() {
        return size;
    }
    public int getNumberOfCorners(){
        return switch (this.shape){
            case 0b1: yield 3;
            case 0b10: yield 4;
            case 0b100: yield 0;
            default: throw new IllegalStateException("Illegal shape");
        };
    }
    public String getData(){
        return "\n figura o rozmiarze: " + this.getSize()+". ma: " + this.getNumberOfCorners() + " boków.";
    }

}
