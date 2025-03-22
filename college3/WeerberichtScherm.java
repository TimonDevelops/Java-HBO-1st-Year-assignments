import javax.swing.*;
import java.awt.*;

public class WeerberichtScherm {
    JFrame scherm;
    public Weerbericht weerbericht;
    JLabel labelDag, labelTemperatuur, labelWind, labelAfbeelding;

    public WeerberichtScherm() {
        ImageIcon thermometer = new ImageIcon("thermometer.png");
        this.scherm = new JFrame();
        this.weerbericht = new Weerbericht(20.0, 2, "Z",false, false, true);
        this.labelDag = new JLabel("<html><h1>" + weerbericht.getDagVanDeWeek() + "</h1></html>", SwingConstants.CENTER);
        this.labelTemperatuur = new JLabel("<html><h2>" + weerbericht.getTemperatuur() + "°C </html></h2>", thermometer, SwingConstants.CENTER);
        this.labelWind = new JLabel("Wind: " + weerbericht.getWindkracht() + " " + weerbericht.getWindrichting(), SwingConstants.CENTER);
        this.labelAfbeelding = new JLabel(weerbericht.getWeerAfbeelding());
        scherm.add(labelDag); 
        scherm.add(labelAfbeelding);
        scherm.add(labelTemperatuur); 
        scherm.add(labelWind); 
        scherm.setLayout(new GridLayout(4, 1));
        scherm.setSize(200, 600);
        scherm.setVisible(true);
    }
}