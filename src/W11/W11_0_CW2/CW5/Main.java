package W11.W11_0_CW2.CW5;

public class Main {
    public static void main(String[] args) {
        CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy(2,30);
        if(ciagnikSiodlowy.czyMozeJechac())
            System.out.println("Może jechać");
        else
            System.out.println("Jazda niebezpieczna");
    }
}
