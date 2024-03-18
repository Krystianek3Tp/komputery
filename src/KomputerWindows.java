public class KomputerWindows implements Komputer{
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

    public KomputerWindows(String procesor, String kartaGraficzna, String plytaGlowna) {
        Procesor = procesor;
        KartaGraficzna = kartaGraficzna;
        PlytaGlowna = plytaGlowna;
    }

}


