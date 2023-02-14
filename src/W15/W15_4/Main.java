package W15.W15_4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis;
        StringBuilder sb = new StringBuilder();
        int tmp;
        try {
            fis = new FileInputStream("C:\\Users\\mikol\\Documents\\PPJ\\src\\W15\\W15_4\\input");
            tmp = fis.read();
            while (tmp!=-1){
                if(tmp>'0'&&tmp<'9')
                    sb.append((char)tmp);
                tmp=fis.read();
            }
            System.out.println(sb);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        long bigNum = Integer.parseInt(sb.toString());
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(new File("src/W15/W15_4/1.txt"));
            long mask = 0xFFFFL;

            for (int i = 0; i <= 56; i+=8) {
                fos.write((int)(bigNum>>i));
            }


        } catch (FileNotFoundException | SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
