package W15.W15_7;

import W14.W14_1.MyScanner;

import java.io.InputStream;
import java.io.InputStreamReader;

public class MyTerminal {
    private final MyFrame myFrame;
    public MyTerminal(MyFrame myFrame) {
        Path.setMyFrame(myFrame);
        this.myFrame= myFrame;
    }
    public void open(){
        MyScanner ms = new MyScanner(System.in);
        Path.setStart(myFrame.getElementByIndex(4));
        for (Link l : Element.myFrame.elements[4].links) {
            System.out.println("CHECK: "+l.getPartnerIndex());
        }


        Path path = new Path(myFrame.getElementByIndex(4));
        path.soutPaths();
    }
}
