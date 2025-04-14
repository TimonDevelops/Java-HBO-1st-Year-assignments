import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knopteller implements ActionListener {
    int teller = 0;
    public void actionPerformed(ActionEvent e) {
        teller++;
        System.out.println("De knop is " + teller + " keer ingedrukt");
    }
}
