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
        storage.ciastkos[1].staticParamentr=4;
        storage.ciastkos[4].draw();

        //ststyczny parametr obiektu nadany dla obiektu o indeksie 1 zmienia też wszystkie inne maramerty.
        System.out.println(storage.ciastkos[4].staticParamentr);

        //Przerobiono listy, zamiast tablic zbiór adresów obiektów.
    }
}