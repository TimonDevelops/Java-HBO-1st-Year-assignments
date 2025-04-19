public abstract class Reisdocument implements Legitimatiebewijs {
    protected String naam;
    protected String BSN;
    public abstract String getGeldigeLanden();

    public Reisdocument(String naam, String BSN) {
        this.naam = naam;
        this.BSN = BSN;
    }

    public String getNaam() {
        return naam;
    }

    public String getBSN() {
        return BSN;
    }

    public String toString() {
        return " type: " + getDocumentType() + " geldig in " + getGeldigeLanden();
    }
}
