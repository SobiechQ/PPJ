package W14.W14_1;

import java.util.Objects;

public class Terminal {
    MyScanner ms = new MyScanner(System.in);
    DataStream ds = new DataStream("C:\\Users\\mikol\\Documents\\PPJ\\src\\W14\\W14_1\\db.txt");
    public void open(){
        String inputCommand;
        do{
            inputCommand=ms.getWord();
            switch (inputCommand){
                case "add"-> add();
                case "list"-> ds.draw();
                case "drop"-> ds.drop();
            }



        }while (!Objects.equals(inputCommand, "exit"));
    }
    private void add(){
        System.out.println();
        System.out.print("Podaj nazwe: ");
        String name = ms.getWord();
        System.out.print("Podaj haslo: ");
        String pass = ms.getWord();
        if (ds.pushSoft(name,pass)){
            System.out.println("Akcja przebiegła pomyślnie!");
            return;
        }
        System.out.println("Użytkownik już jest w bazie danych");
    }
}
