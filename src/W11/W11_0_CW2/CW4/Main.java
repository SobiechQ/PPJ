package W11.W11_0_CW2.CW4;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(10,30);
        prostokat.printArea();
        Prostopadloscian prostopadloscian = new Prostopadloscian(10,30,2);
        prostopadloscian.printArea();
        prostopadloscian.printVolume();

        Ostroslup ostroslup = new Ostroslup(3);
        ostroslup.printVolume();
        ostroslup.printArea();

        Graniastoslup graniastoslup = new Graniastoslup(3,15);
        graniastoslup.printVolume();
    }
}
