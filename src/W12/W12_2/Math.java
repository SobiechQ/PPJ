package W12.W12_2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Math {
    private int a;
    private int b;
    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double dziel(){
        try {
            FileReader reader = new FileReader("asd.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return 3;
    }
}

