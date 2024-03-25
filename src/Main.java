import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputery = new ArrayList<Komputer>();
        KomputerWindows windows = new KomputerWindows("Intel","RTX","nieznane");
        KomputerMac mac = new KomputerMac("macprocesor","mackarta","macplyta");

        komputery.add(windows);
        komputery.add(mac);

        Collections.sort(komputery);

        for (Komputer komputer : komputery) {
            System.out.println(komputer);
        }
    }
}