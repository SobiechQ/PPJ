package W15;

import java.awt.*;

public class Circle extends Figure{
    protected double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: ("+ super.toString()+", "+this.radius+")";
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(
                (int) (this.x-this.radius), (int) (this.y-this.radius), (int) (radius*2), (int) (radius*2)
        );
    }
}
