import java.util.ArrayList;

public class Film {

    public static void main(String[] args) {
        double draaiDagen = 210;
        double personeelKosten = 0;
        ArrayList<Persoon> personeel = new ArrayList<>();

        Persoon medewerker1 = new Medewerker("Gerie", "12-6-1977", "Vrouw", "Catering", 80);
        personeel.add(medewerker1);
        Persoon medewerker2 = new Medewerker("Laura", "24-4-1989", "Vrouw", "Opmaak", 95);
        personeel.add(medewerker2);

        Persoon acteur1 = new Acteur("Willy", "20-2-1998","Man" , "8,6", 200000);
        personeel.add(acteur1);
        Persoon acteur2 = new Acteur("Dexter", "11-8-2003","Man" , "7,9", 175000);
        personeel.add(acteur2);

        for (Persoon persoon : personeel) {
            personeelKosten += persoon.berekenBeloning(draaiDagen);
            
        }
        System.out.println("De personeelkosten voor deze film bedraagt : $" + personeelKosten);
    }
}