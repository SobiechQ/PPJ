package w4;

public class Telefon {
    String interfejsKompunkacyjny;
    String kolor;
    public void zadzwon(String numer) throws EmptyNumberExeption {
        if(numer==null)
            throw new EmptyNumberExeption();
        System.out.println(numer);
    }
}
