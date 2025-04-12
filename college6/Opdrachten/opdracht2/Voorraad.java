import java.util.ArrayList;
import java.util.Comparator;

public class Voorraad {

    public static void main(String[] args) {
    ArrayList<Telefoon> voorraad = new ArrayList<>();
    Telefoon tel1 = new Telefoon("Samsung", "A35", 200);
    voorraad.add(tel1);
    Telefoon tel2 = new Telefoon("Iphone", "11", 450);
    voorraad.add(tel2);
    Telefoon tel3 = new Telefoon("Motorola", "Edge", 340);
    voorraad.add(tel3);

    System.out.println(voorraad);
    
    // gebruikt Comparator interface uit Voorraad
    voorraad.sort(Comparator.comparing(t -> t.getMerk()));

    System.out.println(voorraad);

    // gebruikt Comparable interface uit Telefoon met zelf gedefineerde compareTo methode, null = gebruik de method zoals in klasse geschreven
    voorraad.sort(null);

    System.out.println(voorraad);
    }
}