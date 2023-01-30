package W15;

import java.awt.*;

public class Figure {
    protected int x;
    protected int y;
    protected Color color;
    public static final String ZIELONY = "Zielony";
    public static final String MAGENTA = "Magenta";
    protected Figure(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color= switch (color){
            case Figure.MAGENTA -> Color.MAGENTA;
            case Figure.ZIELONY -> Color.GREEN;
            default -> Color.WHITE;
        };
    }
    public static Figure make(int x, int y){
        return new Circle(x,y,Figure.MAGENTA,x*y);

    }
    public void draw(Graphics g){

    }

    @Override
    public String toString() {
        return "Figure: ("+this.x+", "+this.y+", "+this.color+")";
    }
}
