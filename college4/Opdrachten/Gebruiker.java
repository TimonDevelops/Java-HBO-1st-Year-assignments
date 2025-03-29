public class Gebruiker {
    private String naam;
    private int leeftijd;

    public Gebruiker(String naam, int leeftijd) {
        setNaam(naam);
        setLeeftijd(leeftijd);
    }

    //setters
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    //getters
    public String getNaam() {
        return naam;
    }
    public int getLeeftijd() {
        return leeftijd;
    }

    //print/toString
    public String toString() {
        return "Naam: " + naam + " Leeftijd: " + leeftijd;
    }
}
