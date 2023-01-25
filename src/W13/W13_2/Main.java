package W13.W13_2;

public class Main {
    public static void main(String[] args) {
        MyScanner ms = new MyScanner(System.in);

        while (true) {
            try {
                System.out.println(ms.readPosInt()*2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
