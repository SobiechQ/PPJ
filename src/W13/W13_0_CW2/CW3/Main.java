package W13.W13_0_CW2.CW3;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader;
        try {
            fileReader = new FileReader("C:\\Users\\mikol\\Documents\\PPJ\\src\\W13\\W13_0_CW2\\CW3\\input.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int readVal=-1;
        try {
            readVal = fileReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuffer stringBuffer = new StringBuffer();
        do{
            stringBuffer.append((char)readVal);

            try {
                readVal=fileReader.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while (readVal!=-1);






        try {
            FileOutputStream fos = new FileOutputStream(
                    new File("C:\\Users\\mikol\\Documents\\PPJ\\src\\W13\\W13_0_CW2\\CW3\\out.txt")
            );
            fos.write(stringBuffer.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
