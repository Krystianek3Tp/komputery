public class KomputerMac implements Komputer{
    @Override
    public void uruchom() {
        System.out.println("dziala");
    }

    @Override
    public void zepsujSie() {
        System.out.println("psuje sie");
    }

    public String Procesor;
    public String KartaGraficzna;
    public String PlytaGlowna;

    public KomputerMac(String procesor, String kartaGraficzna, String plytaGlowna) {
        Procesor = procesor;
        KartaGraficzna = kartaGraficzna;
        PlytaGlowna = plytaGlowna;
    }
}
