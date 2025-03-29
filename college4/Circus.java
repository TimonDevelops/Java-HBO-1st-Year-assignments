import java.util.ArrayList;


public class Circus {
    private String naam;
    private ArrayList<Artiest> artiesten;
    private ArrayList<CircusAct> acts;

    public Circus(String naam) {
        this.naam = naam;
        acts = new ArrayList<>();
        artiesten = new ArrayList<>();
        System.out.println(this.naam);
    }
    public void voegActToe(CircusAct act) {
        acts.add(act);
    }
    public void voegArtiestToe(Artiest artiest) {
        artiesten.add(artiest);
    }
    public void getAantalArtiesten() {
        int aantal = artiesten.size();
        System.out.println("Aantal artiesten: " + aantal);
    }
    public void getAantalActs() {
        int aantal = acts.size();
        System.out.println("Aantal acts: " + aantal);
    }
    public CircusAct zoek(int tijdsduur) {
        CircusAct resultaat = null;
        for (CircusAct act : acts) {
            if (act.getTijdsduur() == tijdsduur) {
                resultaat = act;
            }
        }   return resultaat;
    }
    public int tijdVanAlleActs() {
        int totaalTijd = 0;
        for (CircusAct act : acts) {
            totaalTijd += act.getTijdsduur();
        }
        return totaalTijd;
    }
    // prints/toString
    public void printActOverzicht() {
        for (CircusAct act : acts) {
            act.printAct();
        }
    }
    public void printArtiesten() {
        int i = 0;
        for (Artiest artiest : artiesten) {
            i += 1;
            System.out.println("Artiest " + i + ": " + artiest.toString());
        }
        // classic
        // for (int i = 0; i < artiesten.length; i++) {
        //     System.out.println("Artiest " + i + ": " + artiesten[i].toString());
        // }
        }
}
