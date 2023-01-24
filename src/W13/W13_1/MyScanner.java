package W13.W13_1;

import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    InputStream inputStream;

    public MyScanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     get word that ends with end of line char or space.
     */

    public String getWord(){
        int tmpChar;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            try {
                tmpChar = inputStream.read();
                if(!(tmpChar=='\n'||tmpChar==' '))
                    stringBuffer.append((char)tmpChar);
            } catch (IOException e) {
                return "IO error.";
            }
        }while (!(
                (tmpChar==-1)||
                (tmpChar==' ')||
                (tmpChar=='\n')
                ));
        return stringBuffer.toString();

    }
}
