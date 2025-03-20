import javax.swing.*;
import java.awt.*;

public class WeerberichtScherm {
    JFrame scherm;
    Weerbericht weerbericht;
    JLabel labelDag;
    JLabel labelTemperatuur;
    JLabel labelWind;

    public WeerberichtScherm() {
        this.scherm = new JFrame();
        this.weerbericht = new Weerbericht(4.0, 9, "NO",true, false, true);
        this.labelDag = new JLabel(String.valueOf("<html><h1>" + weerbericht.getDagVanDeWeek()) + "</h1></html>", SwingConstants.CENTER);
        this.labelTemperatuur = new JLabel("Temperatuur: " + weerbericht.getTemperatuur() + "°C", SwingConstants.CENTER);
        this.labelWind = new JLabel("Wind: " + weerbericht.getWindkracht() + " " + weerbericht.getWindrichting(), SwingConstants.CENTER);
        scherm.add(labelDag); 
        scherm.add(labelTemperatuur); 
        scherm.add(labelWind); 
        scherm.setLayout(new GridLayout(4, 1));
        scherm.setSize(200, 600);
        scherm.setVisible(true);
    }
}