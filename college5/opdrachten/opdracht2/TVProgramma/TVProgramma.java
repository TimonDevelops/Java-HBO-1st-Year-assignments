public abstract class TVProgramma {
    String titel;
    int tijdsduur;
    int zender;

    public TVProgramma(String titel, int tijd, int zender) {
        this.titel = titel;
        this.tijdsduur = tijd;
        this.zender = zender;
    }

    public String toString() {
        return "Titel: " + titel + " Tijd: " + tijdsduur + " Zender: " + zender;
    }
}