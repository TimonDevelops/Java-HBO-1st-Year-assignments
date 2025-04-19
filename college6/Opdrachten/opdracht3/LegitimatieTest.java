public class LegitimatieTest {

    public static void main(String[] args) {
        Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
        persoon1.setRijbewijs(new Rijbewijs(persoon1.getLegitimatie().getNaam(), persoon1.getLegitimatie().getBSN(), "AM"));
        Persoon persoon2 = new Persoon(new Identiteitskaart("Jennie", "4432098"));
        Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));
        persoon3.setRijbewijs(null);

       persoon1.toonOverzicht();
       persoon2.toonOverzicht();
       persoon3.toonOverzicht();
    }

}