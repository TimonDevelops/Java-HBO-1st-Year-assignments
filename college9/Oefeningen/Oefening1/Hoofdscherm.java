import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Hoofdscherm extends JFrame implements ActionListener {
    
    private JTextArea tekst;
    private JButton loginBtn;
    private JButton logoutBtn;
    private MijnDialoog dialoog;

    public Hoofdscherm() {

        setSize(400, 300);
        setTitle("Inloggen");
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);


        loginBtn = new JButton("inloggen");
        loginBtn.addActionListener(this);
        logoutBtn = new JButton("uitloggen");
        logoutBtn.addActionListener(this);
        tekst = new JTextArea(2, 1);
        add(loginBtn);
        add(tekst);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // maak dialog aan met deze frame instantie als ouder en "dialoog" als kind

        if (e.getSource() == loginBtn) {
            dialoog = new MijnDialoog(this);
            dialoog.setVisible(true);
            if (dialoog.getisOK()) {
                remove(loginBtn);
                remove(tekst);
                add(logoutBtn);
                add(tekst);
                String naam = dialoog.getNaam();
                String wachtwoord = dialoog.getWachtwoord();
                tekst.setText("Gebruikersnaam: " + naam + "\nWachtwoord: " + wachtwoord);
                JOptionPane.showMessageDialog(this, "U bent succesvol ingelogd");

            } else {
                tekst.setText("Inloggen geannuleerd");
                JOptionPane.showMessageDialog(this, "Inloggen mislukt");
            }
        } else {
            int keuze = JOptionPane.showConfirmDialog(this, "Weet u het zeker?", "Vraag", JOptionPane.YES_NO_OPTION);
            if(keuze == JOptionPane.YES_OPTION) {
                tekst.setText("");                
                remove(tekst);
                remove(logoutBtn);
                add(loginBtn);
                add(tekst);
            } 
        }
        
    }
}

            // 