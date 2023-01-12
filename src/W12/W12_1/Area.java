package W12.W12_1;

public class Area extends MathObject{
    int width;
    int height;
    public Area(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public String getWidthHeight(){
        return this.width+" "+this.height;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void draw(){
        System.out.println(super.getName()+" "+this.getWidthHeight());
    }
}
