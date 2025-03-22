public class WeerberichtTest {

    public static void main(String[] args) {

        WeerberichtScherm weerberichtScherm = new WeerberichtScherm();  
        System.out.println(weerberichtScherm.weerbericht);
        weerberichtScherm.weerbericht.verhoogDag(1);
        System.out.println(weerberichtScherm.weerbericht);
        weerberichtScherm.weerbericht.verhoogDag(1);
        System.out.println(weerberichtScherm.weerbericht);
    }
}