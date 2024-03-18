import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputery = new ArrayList<Komputer>();
        KomputerWindows windows = new KomputerWindows("Intel","RTX","nieznane");
        KomputerMac mac = new KomputerMac("macprocesor","mackarta","macplyta");

        komputery.add(windows);
        komputery.add(mac);

    }
}