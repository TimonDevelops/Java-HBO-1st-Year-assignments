public class Serie extends TVProgramma {
    String regisseur;
    int aflNummer;

    public Serie(String titel, int tijdsduur, int zender, String r, int a) {
        super(titel, tijdsduur, zender);
        regisseur = r;
        aflNummer = a;
    }

    public String toString() {
        return super.toString() + " Regisseur: " + regisseur + " Afleveringsnummer " + aflNummer;
    }
}