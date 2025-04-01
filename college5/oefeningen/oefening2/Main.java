import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Drumstel drumst1 = new Drumstel();
        Instrument drumst2 = new Drumstel();
        Instrument trompet1 = new Trompet();

        ArrayList<Instrument> orkest = new ArrayList<Instrument>();
        orkest.add(drumst1);
        orkest.add(drumst2);
        orkest.add(trompet1);

        for (Instrument i : orkest) {
            i.maakGeluid();
        }

    }
}