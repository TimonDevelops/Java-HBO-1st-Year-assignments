public class Medewerker extends Persoon {
    String functie;

    public Medewerker(String naam, String geboorteDatum, String geslacht, String functie, double beloning) {
        super(naam, geboorteDatum, geslacht, beloning);
        this.functie = functie;
    }
    public double berekenBeloning(double draaiDagen) {
       return beloning * draaiDagen;   
    }

    public String toString() {
        return "Medewerker: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht + " Functie: " + functie;
    }
}