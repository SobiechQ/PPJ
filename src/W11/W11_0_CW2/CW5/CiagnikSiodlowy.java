package W11.W11_0_CW2.CW5;

public class CiagnikSiodlowy extends PojazdKolowy{
    float masa;
    public CiagnikSiodlowy(int iloscOsi, float masa) {
        super(iloscOsi);
        this.masa = masa;
    }
    public boolean czyMozeJechac(){
        return this.masa/getIloscOsi()<11;
    }
}
