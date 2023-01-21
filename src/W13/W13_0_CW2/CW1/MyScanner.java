package W13.W13_0_CW2.CW1;

import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    InputStream inputStream;

    public MyScanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    public String readWord(){
        StringBuffer stringBuffer = new StringBuffer();
        int tmpReadValue=-1;
        do {
            try {
                tmpReadValue=inputStream.read();
                stringBuffer.append((char)tmpReadValue);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (tmpReadValue!=' '&&tmpReadValue!=-1);

        return stringBuffer.toString();
    }
}
