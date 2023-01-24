package W13.W13_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class DataLink {
    public static MyScanner ms=new MyScanner(System.in);
    File file;
    public DataLink(String path) {
        this.file = new File(path);
    }
    public void runCLI(){
        String command;
        while (!Objects.equals(command = ms.getWord(), "exit")){
            switch (command){
                case "add"->userAdd();
            }
        }

    }
    private void userAdd() {
        System.out.println(" ");
        System.out.print("Podaj nick: ");
        String name = ms.getWord();
        System.out.println(" ");
        System.out.println("Podano: " + name);
        System.out.print("Podaj haslo: ");
        String password = ms.getWord();
        System.out.println(" ");
        System.out.println("Podano: " + password);
        System.out.println(" ");
        User user = new User(name, password);

        try {
            FileWriter fw = new FileWriter(file.getAbsolutePath());
            fw.write("user:"+user.getLogin()+":pass:"+user.getPassword());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
