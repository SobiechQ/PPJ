package W15.W15_5;

import W15.Circle;
import W15.Figure;

import java.awt.*;

public class MyFrame
        extends Frame {
    private static final MyFrame myFrame = new MyFrame();
    static {
        myFrame.setSize(400,400);
        myFrame.setVisible(true);
    }
    public void paint(Graphics g) {
        g.fillOval(
                (int) (30), (int) (100), (int) (20), (int) (35)
        );

    }


}
