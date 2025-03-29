import java.time.LocalDateTime;
import java.util.ArrayList;

public class Chat {
    String naam;
    ArrayList<Bericht> berichten;
    
    public Chat(String naam) {
        setNaam(naam);
        berichten = new ArrayList<>();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void voegToe(Bericht bericht) {
        berichten.add(bericht);
    }
    public ArrayList<Bericht> zoekBerichtenVan(Gebruiker gebruiker) {
        ArrayList<Bericht> berichtenVanGebruiker = new ArrayList<>();
        for (Bericht bericht : berichten) {
            if (bericht.getAfzender().getNaam().equals(gebruiker.getNaam())) {
                berichtenVanGebruiker.add(bericht);
            }
        } return berichtenVanGebruiker;    
    }
    public ArrayList<Bericht> zoekBerichten(String tekst) {
        ArrayList<Bericht> gevondenBerichten = new ArrayList<>();
        for (Bericht bericht : berichten) {
            if (bericht.getBericht().contains(tekst)) {
                gevondenBerichten.add(bericht);
            }
        } return gevondenBerichten;
    }
    public ArrayList<Bericht> zoekBerichtenVan(ArrayList<Gebruiker> gebruikers) {
        ArrayList<Bericht> berichtenVanGebruikers = new ArrayList<>();
        for (Gebruiker gebruiker : gebruikers) { 
            ArrayList<Bericht> berichtVanGebruiker = zoekBerichtenVan(gebruiker);
            for (Bericht bericht : berichtVanGebruiker) {
                berichtenVanGebruikers.add(bericht);
            }
        } return berichtenVanGebruikers;
    }

    //  prints/toString
    public void printBerichtenVan(Gebruiker gebruiker) {
        for (Bericht bericht : berichten) {
            if (bericht.getAfzender().getNaam().equals(gebruiker.getNaam())) {
                System.out.println(bericht);
            }
        }
    }
    public void printBerichtenSinds(LocalDateTime datum) {
        for (Bericht bericht : berichten) {
            if (bericht.getDatum().isAfter(datum))
            {
                System.out.println(bericht);
            }
        }
    }
    public void printChat() {
        for (Bericht bericht : berichten) {
            System.out.println(bericht);
        }
    }
}