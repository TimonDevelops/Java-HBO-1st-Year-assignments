public class Medewerker extends Persoon {
    String functie;

    public Medewerker(String naam, String geboorteDatum, String geslacht, String functie) {
        super(naam, geboorteDatum, geslacht);
        this.functie = functie;
    }

    public String toString() {
        return "Medewerker: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht + " Functie: " + functie;
    }
}