package W12.W11_1;

public class MathObject {
    protected String name;
    public MathObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void draw(){
        System.out.println(this.name);
    }
}
