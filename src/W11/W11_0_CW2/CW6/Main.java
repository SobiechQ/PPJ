package W11.W11_0_CW2.CW6;

import java.util.Arrays;

public class Main {
    public static final char SPACE_EMPTY ='\u2591';
    public static final char SPACE_LINE='\u2593';
    public static final char SPACE_DRAW='*';
    public static void main(String[] args) {


        //Console Graphics class showcase.
        {
            ClonsoleGraphics c = new ClonsoleGraphics(124, 58);
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
    }
}
