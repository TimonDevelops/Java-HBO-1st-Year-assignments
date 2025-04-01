public class Persoon {
    private String naam;
    private int lengte;

    public Persoon(String n, int l) {
        naam = n;
        lengte = l;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    public int getLengte() {
        return lengte;
    }
    public String toString() {
        return "Naam: " + naam + " Lengte: " + lengte;
    }
}

