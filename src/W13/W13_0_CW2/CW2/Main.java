package W13.W13_0_CW2.CW2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        PNWReader pnwReader = null;
        try {
            pnwReader = new PNWReader(new FileReader("C:\\Users\\mikol\\Documents\\PPJ\\src\\W13\\W13_0_CW2\\CW2\\input.txt"), 2);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IllegalArgumentException e){
            System.out.println("Parametr to show jest poza zakresem. Wprowadz wartość z zakresu <0;2>");
        }
        try {
            pnwReader.draw();
        } catch (IllegalStateException e) {
            System.out.println("Pierwsze");
        }
        try {
            pnwReader.draw();
        } catch (IllegalStateException e) {
            System.out.println("Nie można, bo wykonano już wcześniej");
        }
    }
}
