public class CircusTest {
    
    public static void main(String[] args) {
        Artiest artiest1 = new Artiest("Martha Morgana");
        System.out.println(artiest1);
        Act act1 = new Act("Trapeze", artiest1, 12);
        System.out.println(act1);
        Circus circus = new Circus();
        circus.printArtiesten();
    }
}