public class Acteur extends Persoon {
String rating;

    public Acteur(String naam, String geboorteDatum, String geslacht, String rating, double beloning) {
        super(naam, geboorteDatum, geslacht, beloning);
        this.rating = rating;

    }

    public double berekenBeloning(double draaiDagen) {
        return beloning;
    }

    public String toString() {
        return "Acteur: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht + " Rating: " + rating;
    }
}