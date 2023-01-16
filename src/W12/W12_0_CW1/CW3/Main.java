package W12.W12_0_CW1.CW3;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();

        try {
            telefon.zadzwon(null);
        } catch (EmptyNumberExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
