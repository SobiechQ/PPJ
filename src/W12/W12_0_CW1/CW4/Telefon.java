package W12.W12_0_CW1.CW4;

public class Telefon {
    String interfejsKompunkacyjny;
    String kolor;
    public void zadzwon(String numer) throws EmptyNumberExeption {
        if(numer==null)
            throw new EmptyNumberExeption();
        System.out.println(numer);
    }
}
