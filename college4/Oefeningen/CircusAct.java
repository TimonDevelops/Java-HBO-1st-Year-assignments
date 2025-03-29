import java.util.ArrayList;

public class CircusAct {
    private String naam;
    private int tijdsduur;
    private ArrayList<Artiest> artiesten;

    public CircusAct(String naam, int tijdsduur) {
        artiesten = new ArrayList<>();
        this.naam = naam;
        this.tijdsduur = tijdsduur;
    }

    public void voegArtiestToe(Artiest artiest) {
        artiesten.add(artiest);
    }
    public int getTijdsduur() {
        return tijdsduur;
    }
    public int getAantalArtiesten() {
        int aantal = artiesten.size();
        return aantal;
    }
    // prints/toString
    public void printAct() {
        System.out.println(this);
    }
    public String toString() {
        String print = "";
        for (Artiest artiest : artiesten) {
            if (print != "") {
                print += ", ";
            } print += artiest;
        }
        if (print == "") {
            return "Act " + naam + " heeft nog geen artiesten " + "(" + tijdsduur + " min)";
        }
        else return "Act " + naam + " wordt uitgevoerd door de volgende artiesten: " + print + " (" + tijdsduur + " min)";
    }  
}