package W15.W15_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fw;
        try {
            fw = new FileOutputStream("src/W15/W15_3/tmp.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fw.write(0x0055);
            fw.write(0x0056);
            fw.write(0x0057);
            fw.write(0x0058);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int i=3;
        float f=2.11f;
        char c = 'c';
        boolean b = true;
        System.out.println(fibo(30));

    }
    public static long fibo(int n){
        if(n==0 || n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
