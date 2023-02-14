package W15.W15_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {
    public static FileReader fr;

    static {
        try {
            fr = new FileReader(new File("C:\\FTBserver\\whitelist.json"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getString() {
        StringBuilder sb = new StringBuilder();
        try {
            int tmpRead=fr.read();
            while (!(tmpRead==-1 || tmpRead=='}')){
                if(!(tmpRead=='[' || tmpRead == '{' || tmpRead=='\n' || tmpRead==' ' || tmpRead==']'))
                    sb.append((char)tmpRead);
                tmpRead=fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


}
