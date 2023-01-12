package W11.W11_0_CW2.CW6;

public class MainTrapez {
    public static void main(String[] args) {
        ClonsoleGraphics c = new ClonsoleGraphics(80,30);
        double[][] points =new double[4][2];
        points[0]= new double[]{-5, 5};
        points[1]= new double[]{-20, -5};
        points[2]= new double[]{9, 4};
        points[3]= new double[]{30, -15};
        c.add(points);
        c.show();
    }
}
