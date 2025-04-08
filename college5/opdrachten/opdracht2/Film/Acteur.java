public class Acteur extends Persoon {
String rating;

    public Acteur(String naam, String geboorteDatum, String geslacht, String rating) {
        super(naam, geboorteDatum, geslacht);
        this.rating = rating;

    }

    public String toString() {
        return "Acteur: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht + " Rating: " + rating;
    }
}