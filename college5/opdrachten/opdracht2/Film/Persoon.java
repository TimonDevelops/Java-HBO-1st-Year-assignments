public abstract class Persoon {
String naam;
String geboorteDatum;
String geslacht;

    public Persoon(String naam, String geboorteDatum, String geslacht) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.geslacht = geslacht;
    }

    public String toString() {
        return "Persoon: " + naam + " Geboortedatum: " + geboorteDatum + " Geslacht: " + geslacht;
    }
}