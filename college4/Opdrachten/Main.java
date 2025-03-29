import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Chat chat = new Chat("Buren");
        ArrayList<Gebruiker> gebruikers = new ArrayList<>();

        Gebruiker gebruiker1 = new Gebruiker("Pietje Puk", 23);
        gebruikers.add(gebruiker1);
        Gebruiker gebruiker2 = new Gebruiker("Bart Boer", 35);
        gebruikers.add(gebruiker2);

        Bericht bericht1 = new Bericht(gebruiker1, "Hé hallo, hoe gaat het?");
        chat.voegToe(bericht1);
        Bericht bericht2 = new Bericht(gebruiker2, "Gaat z'n gangetje, hoe is het met jou?");
        chat.voegToe(bericht2);
        Bericht bericht3 = new Bericht(gebruiker1, "Fijn, met mij gaat het goed");
        chat.voegToe(bericht3);
        chat.printChat();
        System.out.println(chat.zoekBerichtenVan(gebruikers));
    }
}



