import java.util.ArrayList;

public class Film {
    public static void main(String[] args) {
        ArrayList<Persoon> personeel = new ArrayList<>();

        Persoon medewerker1 = new Medewerker("Gerie", "12-6-1977", "Vrouw", "Catering");
        personeel.add(medewerker1);
        Persoon medewerker2 = new Medewerker("Laura", "24-4-1989", "Vrouw", "Opmaak");
        personeel.add(medewerker2);

        Persoon acteur1 = new Acteur("Willy", "20-2-1998","Man" , "8,6");
        personeel.add(acteur1);
        Persoon acteur2 = new Acteur("Dexter", "11-8-2003","Man" , "7,9");
        personeel.add(acteur2);

        for (Persoon persoon : personeel) {
            System.out.println(persoon);
        }
    }
}