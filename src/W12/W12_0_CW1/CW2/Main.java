package w2;

public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Saturn 5",300);
        rocket.refill();
        try {
            rocket.start();
        } catch (LowFullExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
