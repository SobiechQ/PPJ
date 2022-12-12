package W10;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        for (int i = 0; i < 3; i++) {
            storage.make("make");
        }
        storage.add(new Ciastko("Add1"));
        storage.add(new Ciastko("Add2"));
        storage.add(new Ciastko("Add3"));
        storage.draw();
        storage.ciastkos[4].draw();

        //Przerobiono listy, zamiast tablic zbiór adresów obiektów.
    }
}