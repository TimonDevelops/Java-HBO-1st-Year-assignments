public class Persoon {
    String naam;
    int leeftijd;

    public Persoon(String n, int l) {
        naam = n;
        leeftijd = l;
    }
    public void jarig() {
        leeftijd = leeftijd + 1;
    }

    public String toString() {
        return "Naam: " + naam + " Leeftijd: " + leeftijd;
    }
}