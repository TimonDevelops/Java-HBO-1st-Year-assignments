public class Act {
    String naam;
    int tijdsduur;
    private Artiest artiest;

    public Act(String naam, Artiest artiest, int tijdsduur) {
        this.naam = naam;
        this.artiest = artiest;
        this.tijdsduur = tijdsduur;
    }
     public void setArtiest(Artiest artiest) {
        this.artiest = artiest;
     }

     public String toString() {
        return naam + " door " + artiest + " (" + tijdsduur + " min)";
     }
}