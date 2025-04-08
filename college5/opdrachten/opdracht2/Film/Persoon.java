public abstract class Persoon {
String naam;
String geboorteDatum;
String geslacht;
double beloning;

    public Persoon(String naam, String geboorteDatum, String geslacht, double beloning) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.geslacht = geslacht;
        this.beloning = beloning;
    }

    public abstract double berekenBeloning(double draaiDagen);

    public String toString() {
        return "Persoon: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht;
    }
}