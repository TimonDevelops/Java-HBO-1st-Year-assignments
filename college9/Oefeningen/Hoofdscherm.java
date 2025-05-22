import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Hoofdscherm extends JFrame implements ActionListener {
    
    private JTextArea tekst;
    private JButton loginBtn;
    private MijnDialoog dialoog;

    public Hoofdscherm() {

        setSize(400, 300);
        setTitle("Inloggen");
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);


        loginBtn = new JButton("inloggen");
        loginBtn.addActionListener(this);
        tekst = new JTextArea(2, 1);
        add(loginBtn);
        add(tekst);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // maak dialog aan met deze frame instantie als ouder en "dialoog" als kind
        dialoog = new MijnDialoog(this);
        dialoog.setVisible(true);
        if (dialoog.getisOK()) {
            String naam = dialoog.getNaam();
            String wachtwoord = dialoog.getWachtwoord();
            tekst.setText("Gebruikersnaam " + naam + "\nWachtwoord " + wachtwoord);
        } else {
            tekst.setText("Inloggen geannuleerd");
        }
    }
}

