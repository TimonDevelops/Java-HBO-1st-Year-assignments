public class WeerberichtTest {

    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(4.0, 9, "NO",true, false, true);
        WeerberichtScherm weerberichtScherm = new WeerberichtScherm();
        System.out.println(weerbericht);
        System.out.println(weerberichtScherm);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.verhoogDag();
        System.out.println(weerbericht);
        weerbericht.verhoogDag(2);
        System.out.println(weerbericht);
    }
}