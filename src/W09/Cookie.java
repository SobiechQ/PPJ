package W09;

public class Cookie {
    String nazwa;
    int iloscRodzynek;
    int waga;
    private int tajemnica;
    Cookie(int i){
        //konstruktor ma nazwę taką jak klase
        //konstruktor nie ma typu zwracanego.
        this.waga=i;
        this.tajemnica = 100;
        //konstruktor inaczzej fabrykator.


        //this jest zmienną będącą odniesieniem do obiektu.
    }
    public int times(int i){
        return this.waga *=i;
    }

    public int getTajemnica() {
        return tajemnica;
    }
}
