package W13.W13_0_CW2.CW2;

import java.io.FileReader;
import java.io.IOException;

public class PNWReader {


    static final int primeInput = 0;
    static final int armstrongInput = 0;
    static final int wordInput = 0;
    int toShow;
    boolean allowed = true;
    /*
        toShow
        0 - prime numbers
        1 - armstrong numbers.
        2 - words.
     */


    FileReader fileReader;
    public PNWReader(FileReader fileReader, int toShow) throws IllegalArgumentException{
        if(!(toShow>=0&&toShow<=2))
            throw new IllegalArgumentException();
        this.fileReader = fileReader;
        this.toShow = toShow;
    }

    public void draw() throws IllegalStateException{
        //im sorry for spaghetti code below.

        if(!this.allowed)
            throw new IllegalStateException();
        MyListOfPNW myListOfPNW = new MyListOfPNW();
        int tmpReadSegment;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            try {
                tmpReadSegment = fileReader.read();
            } catch (IOException e) {
                System.out.println("Błąd strumienia danych. " + e.getMessage());
                return;
            }
            if(tmpReadSegment!=' '&&tmpReadSegment!=-1)
                stringBuffer.append((char)tmpReadSegment);
            else {
                myListOfPNW.addToList(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }while (tmpReadSegment!=-1);

        MyListOfPNW tmpList = myListOfPNW;
        MyListOfPNW listWordsOnly = new MyListOfPNW();
        int valueToCheck;
        while (tmpList!=null){
            try {
                valueToCheck=Integer.parseInt(tmpList.head);
            } catch (NumberFormatException e) {
                listWordsOnly.addToList(tmpList.head);
                tmpList=tmpList.next;
                continue;
            }
            if(this.toShow==0&&isPrimeNumber(valueToCheck))
                System.out.println(valueToCheck);
            if(this.toShow==1&&isArmstrongNumber(valueToCheck))
                System.out.println(valueToCheck);

            tmpList=tmpList.next;
        }
        if(this.toShow==2)
            listWordsOnly.printList();
        this.allowed=false;
    }
    private boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();
        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }
        return result == originalNum;
    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
