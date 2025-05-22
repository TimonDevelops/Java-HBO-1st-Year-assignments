import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MijnDialoog extends JDialog implements ActionListener {
    JButton ok;
    JButton annuleren;
    boolean isOK;
    JTextField naamT;
    JTextField wachtwoordT;
    
    public MijnDialoog(JFrame frame) {
        super(frame, true);

        setSize(400, 300);
        setTitle("Inloggen");
        setLayout(new GridLayout(3, 2, 5, 5));


        JLabel naamL = new JLabel("Gebruikersnaam");
        naamT = new JTextField();
        JLabel wachtwoord = new JLabel("Wachtwoord");
        wachtwoordT = new JTextField();
        ok = new JButton("ok");
        ok.addActionListener(this);
        annuleren = new JButton("annuleren");
        annuleren.addActionListener(this);

        add(naamL);
        add(naamT);
        add(wachtwoord);
        add(wachtwoordT);
        add(ok);
        add(annuleren);
    }

    public boolean getisOK() {
        return isOK;
    }

    public String getNaam() {
        return naamT.getText();
    }

    public String getWachtwoord() {
        return wachtwoordT.getText();
    }

        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            isOK = true;
        } else {
            isOK = false;
        } 
        setVisible(false);
    }

}
