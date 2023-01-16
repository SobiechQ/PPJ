package W12.W12_0_CW1.CW4;

public class Main {
    public static void main(String[] args) {
        Komorka komorka = new Komorka();
        try {
            komorka.zadzwon("11");
            komorka.zadzwon("22");
            komorka.zadzwon("33");
            komorka.zadzwon("44");
            komorka.zadzwon("55");
            komorka.zadzwon("66");
            komorka.zadzwon("77");
            komorka.zadzwon("88");
            komorka.zadzwon("99");
            komorka.zadzwon("00");
            komorka.zadzwon("11");
            komorka.draw();
        } catch (EmptyNumberExeption e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
}
