import javax.swing.*;
import java.awt.*;

public class WeerberichtTest {

    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(20.0, 2, "Z",false, false, true);
        WeerberichtScherm weerberichtScherm1 = new WeerberichtScherm(weerbericht);
        weerbericht.verhoogDag(1);
        WeerberichtScherm weerberichtScherm2 = new WeerberichtScherm(weerbericht);
        weerbericht.verhoogDag(1);
        WeerberichtScherm weerberichtScherm3 = new WeerberichtScherm(weerbericht);

        JFrame scherm = new JFrame("Weerberichten");
        scherm.add(weerberichtScherm1.getJPanel());
        scherm.add(weerberichtScherm2.getJPanel());
        scherm.add(weerberichtScherm3.getJPanel());



        scherm.setLayout(new GridLayout(1, 3));
        scherm.setSize(400, 600);
        scherm.setVisible(true);
    }
}