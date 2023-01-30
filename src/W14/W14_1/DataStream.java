package W14.W14_1;

import java.io.*;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataStream {
    private FileReader fr;
    public String path;
    public DataStream(String path) {
        this.path=path;
        reloadFile();
    }
    private void reloadFile(){
        try {
            this.fr = new FileReader(new File(this.path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void draw(){
        try {
            int tmpRead = fr.read();
            while (tmpRead!=-1){
                System.out.print((char)tmpRead);
                tmpRead = fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        reloadFile();
    }
    /**
     * pushHard adds string into end of db. Improper use may produce a DB corruption.
     */
    public void pushHard(String input){

        //Read prevois data.
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int tmpRead = fr.read();
            while (tmpRead!=-1){
                stringBuffer.append((char)tmpRead);
                tmpRead = fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Append into bufferString and write .tostring into file
        stringBuffer.append(input);
        stringBuffer.append('\n');
        try {
            FileWriter fw = new FileWriter(this.path);
            fw.write(stringBuffer.toString());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        reloadFile();
    }

    /**
     * Push soft adds user into database. ID is autoincrement, prevents user redundancy. Returned value determines if successfully.
     */
    public boolean pushSoft(String inputName, String inputPass){
        //todo protect input name from injection
        Pattern pattern = Pattern.compile("([\\w]+):([\\w]+):([\\w]+)");
        Matcher matcher;
        String nextRow;
        String foundName=null;
        do {
            nextRow = getRowOfData();
            matcher = pattern.matcher(nextRow);
            if(matcher.find())
                foundName = matcher.group(2);
        } while (!(nextRow.length()==0 ||
                Objects.equals(inputName, foundName)
                ));
        reloadFile();

        if(nextRow.length()!=0)
            //Length other than 0, means do while couldn't go through all data.
            //This is when inputName is found in database.
            return false;
        this.pushHard(Integer.toString(getLastId()+1)+":"+inputName+":"+User.getMD5(inputPass));
        return true;
    }
    public User getUserById(int inputId)throws DbException {
        Pattern pattern = Pattern.compile("([\\w]+):([\\w]+):([\\w]+)");
        Matcher matcher;
        String nextRow = getRowOfData();
        if (inputId<0)
            throw new IllegalArgumentException("Id cant be lower than 0");
        while (nextRow.length()!=0) {
            matcher = pattern.matcher(nextRow);
            int foundId = -1;
            if (matcher.find())
                foundId = Integer.parseInt(matcher.group(1));
            if (foundId == inputId) {
                reloadFile();
                return new User(inputId, matcher.group(2), matcher.group(3));
            }
            nextRow = getRowOfData();
        }
        reloadFile();
        throw new DbException("No user found");
    }
    public void drop(){
        try {
            FileWriter fw = new FileWriter(this.path);
            fw.write("");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String getRowOfData(){
        //always reload file after done with getRow.
        StringBuilder sb = new StringBuilder();
        int tmpRead;
        try {
            //Read row of data.
            tmpRead = fr.read();
            while (!(tmpRead==-1||tmpRead=='\n')){
                sb.append((char)tmpRead);
                tmpRead = fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    public int getLastId(){
        Pattern pattern = Pattern.compile("([\\w]+):([\\w]+):([\\w]+)");
        Matcher matcher;

        //todo change to private
        String previousRow=null;
        String nextRow=getRowOfData();
        while (nextRow.length()!=0){
            previousRow=nextRow;
            nextRow=getRowOfData();
        }
        reloadFile();
        if(previousRow!=null) {
            matcher = pattern.matcher(previousRow);
            if (matcher.find())
                return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }
}
