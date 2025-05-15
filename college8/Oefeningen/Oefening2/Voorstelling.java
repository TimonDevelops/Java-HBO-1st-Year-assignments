public class Voorstelling {
    private String naam;
    private int aantalPlaatsen;
    private int aantalVerkocht;

    public Voorstelling(String naam, int aantal) {
        this.naam = naam;
        aantalPlaatsen = aantal;
        this.aantalVerkocht = 0;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    public int getAantalVerkochtePlaatsen() {
        return aantalVerkocht;
    }

    public void verkoopKaartje(int aantal) {
        if (aantalPlaatsen >= aantal) {
            aantalPlaatsen -= aantal;
            aantalVerkocht += aantal;
        }
    }

    public void annuleerKaartje(int aantal) {
        if (aantalVerkocht >= aantal) {
            aantalVerkocht -= aantal;
            aantalPlaatsen += aantal;
        }
    }
}
