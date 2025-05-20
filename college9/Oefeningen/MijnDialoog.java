import javax.swing.*;
import java.awt.*;

public class MijnDialoog extends JDialog {
    
    public MijnDialoog(JFrame frame) {
        super(frame, true);

        setSize(400, 300);
        setTitle("Inloggen");
        setLayout(new GridLayout(3, 2, 5, 5));


        JLabel naamL = new JLabel("Gebruikersnaam");
        JTextField naamT = new JTextField();
        JLabel wachtwoord = new JLabel("Wachtwoord");
        JTextField wachtwoordT = new JTextField();
        JButton ok = new JButton("ok");
        JButton annuleren = new JButton("annuleren");

        add(naamL);
        add(naamT);
        add(wachtwoord);
        add(wachtwoordT);
        add(ok);
        add(annuleren);
    }
}
