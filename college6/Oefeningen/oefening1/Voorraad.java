import java.time.LocalDate;

public class Voorraad {
    
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        LocalDate tht = vandaag.plusWeeks(2);
        Voedsel steak = new Vlees(tht, "Rund", 5);
        System.out.println(steak);
    }
}
