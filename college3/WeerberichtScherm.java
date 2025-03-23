import javax.swing.*;
import java.awt.*;

public class WeerberichtScherm {
    JPanel paneel;
    Weerbericht weerbericht;
    JLabel labelDag, labelTemperatuur, labelWind, labelAfbeelding;

    public WeerberichtScherm(Weerbericht weerbericht) {
        ImageIcon thermometer = new ImageIcon("thermometer.png");
        this.paneel = new JPanel();
        this.weerbericht = weerbericht;
        this.labelDag = new JLabel("<html><h1>" + weerbericht.getDagVanDeWeek() + "</h1></html>", SwingConstants.CENTER);
        this.labelTemperatuur = new JLabel("<html><h2>" + weerbericht.getTemperatuur() + "°C </html></h2>", thermometer, SwingConstants.CENTER);
        this.labelWind = new JLabel("Wind: " + weerbericht.getWindkracht() + " " + weerbericht.getWindrichting(), SwingConstants.CENTER);
        this.labelAfbeelding = new JLabel(weerbericht.getWeerAfbeelding());
        paneel.add(labelDag); 
        paneel.add(labelAfbeelding);
        paneel.add(labelTemperatuur); 
        paneel.add(labelWind); 
        paneel.setLayout(new GridLayout(4, 1));
        paneel.setSize(200, 600);
    }

    public JPanel getJPanel() {
        return paneel;
    }
}