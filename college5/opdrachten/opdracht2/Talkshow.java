public class Talkshow extends TVProgramma {
    String presentator;
    String onderwerp;
    
    public Talkshow(String titel, int tijdsduur, int zender, String p, String o) {
        super(titel, tijdsduur, zender);
        presentator = p;
        onderwerp = o;
    }

    public String toString() {
        return super.toString() + " Presentator: " + presentator + " Onderwerp: " + onderwerp; 
    }

}