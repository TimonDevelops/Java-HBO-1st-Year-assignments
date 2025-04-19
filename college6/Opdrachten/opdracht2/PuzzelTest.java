import java.util.ArrayList;

public class PuzzelTest {

    public static void main(String[] args) {
        ArrayList<Puzzelwoord> woorden = new ArrayList<>();
        Puzzelwoord woord1 = new Puzzelwoord("Buitenkans");
        woorden.add(woord1);
        Puzzelwoord woord2 = new Puzzelwoord("Bal");
        woorden.add(woord2);
        Puzzelwoord woord3 = new Puzzelwoord("Kaars");
        woorden.add(woord3);
        
        System.out.println(woorden);

        woorden.sort(null);

        System.out.println(woorden);

        for (Puzzelwoord word : woorden) {
            System.out.println(word);
        }
    }
}