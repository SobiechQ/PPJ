package W15;

import java.awt.*;

public class Square extends Figure{
    protected int side;

    public Square(int x, int y, String color, int side) {
        super(x, y, color);
        this.side = side;
    }
    public void draw(Graphics g) {
    }
}
