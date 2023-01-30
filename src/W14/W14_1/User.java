package W14.W14_1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    public String name;
    public String pass;
    public int id;

    public User(int id,String name, String pass) {
        this.name = name;
        this.pass = pass;
        this.id = id;
    }
    public void drawData(){
        System.out.println("Użytkownik: ("+this.name+"), o ID: ("+this.id+") ma hasło: ("+this.pass+"). ");
    }
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            StringBuilder hashtext = new StringBuilder(no.toString(16));
            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }
            return hashtext.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
