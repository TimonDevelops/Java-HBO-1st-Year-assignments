public class CircusTest {
    
    public static void main(String[] args) {
        // maak een circus aan
        Circus circus = new Circus("Circus Bonzo");
        // maak artiesten aan en voeg toe aan circus
        Artiest artiest1 = new Artiest("Martha Morgana");
        circus.voegArtiestToe(artiest1);
        Artiest artiest2 = new Artiest("Joe Montana");
        circus.voegArtiestToe(artiest2);
        Artiest artiest3 = new Artiest("Billy Joe");
        circus.voegArtiestToe(artiest3);
        Artiest artiest4 = new Artiest("Claire Blair");
        circus.voegArtiestToe(artiest4);
        // maak acts aan, voeg die aan circus toe en voeg artiesten aan deze act
        CircusAct act1 = new CircusAct("Trapeze", 12);
        circus.voegActToe(act1);
        act1.voegArtiestToe(artiest1);
        act1.voegArtiestToe(artiest2);
        CircusAct act2 = new CircusAct("Clown", 8);
        circus.voegActToe(act2);
        act2.voegArtiestToe(artiest3);
        CircusAct act3 = new CircusAct("Dance", 20);
        circus.voegActToe(act3);
        act3.voegArtiestToe(artiest1);
        act3.voegArtiestToe(artiest2);
        act3.voegArtiestToe(artiest3);
        act3.voegArtiestToe(artiest4);
        // prints
        circus.getAantalArtiesten();
        circus.getAantalActs();
        circus.printArtiesten();
        circus.printActOverzicht();
        System.out.println("De tijd van de alle acts bij elkaar is " + circus.tijdVanAlleActs() + " minuten");
    }
}