public class Main {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Jan", 34);
        persoon1.jarig();
        System.out.println(persoon1);
        Werknemer werknemer1 = new Werknemer("Piet", 23);
        werknemer1.jarig();
        werknemer1.verhoogSalaris(200);
        System.out.println(werknemer1);
        Werknemer werknemer2 = new Werknemer("Hanna", 28);
        System.out.println(werknemer2);
        Werknemer werknemer3 = new Werknemer("Dirk", 43);
        System.out.println(werknemer3);
    } 
}