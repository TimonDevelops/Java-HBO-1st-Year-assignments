public class CircusTest {
    
    public static void main(String[] args) {
        Artiest artiest1 = new Artiest("Martha Morgana");
        Artiest artiest2 = new Artiest("Joe Rogan");
        System.out.println(artiest1);
        System.out.println(artiest2);
        CircusAct act1 = new CircusAct("Trapeze", 12);
        System.out.println(act1);
        act1.voegArtiestToe(artiest1);
        act1.voegArtiestToe(artiest2);
        System.out.println(act1);
        Circus circus = new Circus();
        circus.printArtiesten();
        circus.getAantalArtiesten();
    }
}