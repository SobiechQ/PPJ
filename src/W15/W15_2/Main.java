package W15.W15_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String readVal = MyReader.getString();
        while(readVal.length()>=2) {
            System.out.println("Read:     " + readVal);
            Pattern pattern = Pattern.compile("\"uuid\":\"([\\w-]*)\",\"name\":\"([\\w\\p{Punct}]*)\"");
            Matcher matcher = pattern.matcher(readVal);
            if (matcher.find())
                System.out.println("Jest:     " + matcher.group(2));

            readVal = MyReader.getString();
        }
    }
}
