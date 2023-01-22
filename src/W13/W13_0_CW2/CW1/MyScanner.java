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
                break;
            }
        } while (tmpReadValue!=' '&&tmpReadValue!=-1);
        return stringBuffer.toString();
    }
    public String readLine(){
        StringBuffer stringBuffer = new StringBuffer();
        int tmpReadValue;
        do {
            try {
                tmpReadValue=inputStream.read();
                stringBuffer.append((char)tmpReadValue);
            } catch (IOException e) {
                break;
            }
        } while (tmpReadValue!=10);
        return stringBuffer.toString();
    }
    public int readIntegerNumber(){
        StringBuffer stringBuffer = new StringBuffer();
        int tmpReadValue;
        do {
            try {
                tmpReadValue=inputStream.read();
                if(tmpReadValue<'0'||tmpReadValue>'9')
                    throw new IOException();
                stringBuffer.append((char)tmpReadValue);
            } catch (IOException e) {
                break;
            }
        } while (tmpReadValue!=-1);
        return Integer.parseInt(stringBuffer.toString());
    }
    public int readPosIntegerNumber() throws Exception{
        int tmp=readIntegerNumber();
        if(tmp<0)
            throw new Exception();
        return tmp;
    }
}
