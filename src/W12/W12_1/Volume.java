package W12.W12_1;

public class Volume extends Area{
    int depth;
    public Volume(String name, int width, int height, int depth) {
        super(name, width, height);
        this.depth = depth;
    }

    @Override
    public void draw() {
        System.out.println(getName()+" "+getWidthHeight()+" "+this.depth);
    }
}
