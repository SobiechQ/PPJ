package W11.W11_0_CW2.CW6;

import java.util.Arrays;

public class Main {
    public static final char SPACE_EMPTY ='\u2591'; // ░
    public static final char SPACE_LINE='\u2593'; // ▓
    public static final char SPACE_DRAW='*';
    public static void main(String[] args) {
        //Console Graphics class showcase.

        //add method.
        {
            ClonsoleGraphics c = new ClonsoleGraphics(80, 30);
            //On generated object with 60 by 30 dimension, I can find at random 2 points.
            double[] randomPointA = c.generateRandomPoint();
            double[] randomPointB = c.generateRandomPoint();
            System.out.println("Point A: "+Arrays.toString(randomPointA)+", Point B: "+Arrays.toString(randomPointB));
            //I can calculate parameters needed for linear equation for me to connect those 2 points.
            double[] parameters = c.calculateEquation(randomPointA, randomPointB);

            //now I can add both points and a linear function connecting them.
            c.add(randomPointA, randomPointB, parameters);

            //I can also manually add more points if I wish.
            c.add(new double[]{3, 3});
            c.add(new double[]{3, -3});
            c.add(new double[]{-3, 3});
            c.add(new double[]{-3, -3});

            //now I can draw given array.
            c.show();
        }
        //addSin method.
        {
            ClonsoleGraphics c = new ClonsoleGraphics(80,30);
            c.addSin(new double[]{10,0.2,-3});
            c.addSin(new double[]{-10,0.2,3});
            c.show();
        }
        //addTan method.
        {
            ClonsoleGraphics c = new ClonsoleGraphics(80,30);
            c.addTan(new double[]{1.9,0.1,0});
            c.show();
        }
        //addEquation method.
        {
            ClonsoleGraphics c = new ClonsoleGraphics(80,30);
//            c.addEquation(new double[]{0.05,0,0});
//            c.addEquation(new double[]{0.01,0,0,-3});
            c.addEquation(new double[]{0.02,0,-12});
            c.addEquation(new double[]{0.01,-0.1,-0.8,5});
//            c.addEquation(new double[]{0.01,0.1,0.5,5});
            c.show();
        }
    }
}
