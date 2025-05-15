import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scherm extends JFrame implements ActionListener {
    	
    private Voorstelling voorstelling;
    private JLabel jlAantalPlaatsen;
    private JLabel jlAantalVerkocht;
    private JLabel geenGetal;
    private JButton verkoopButton;
    private JButton annuleerButton;
    private JTextField verkoopAantal;
    private JTextField annuleerAantal;
    
    public Scherm(Voorstelling voorstelling) {
        this.voorstelling = voorstelling;

        setTitle("Voorstelling " + voorstelling.getNaam());
		setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Aantal plaatsen vrij:"));
        String aantalPlaatsen = String.valueOf(voorstelling.getAantalPlaatsen());
        jlAantalPlaatsen = new JLabel(aantalPlaatsen);
        add(jlAantalPlaatsen);

        add(new JLabel("Aantal verkocht:"));
        String aantalVerkocht = String.valueOf(voorstelling.getAantalVerkochtePlaatsen());
        jlAantalVerkocht = new JLabel(aantalVerkocht);
        add(jlAantalVerkocht);

        verkoopAantal = new JTextField(10);
        add(verkoopAantal);

        verkoopButton = new JButton("Koop een kaart");
        add(verkoopButton);
        verkoopButton.addActionListener(this);

        annuleerAantal = new JTextField(10);
        add(annuleerAantal);

        annuleerButton = new JButton("Annuleer aankoop");
        add(annuleerButton);
        annuleerButton.addActionListener(this);

        geenGetal= new JLabel("");
        add(geenGetal);

        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        geenGetal.setText("");
        int aantal = 0;

        try {
            if (e.getSource() == verkoopButton) {
                aantal = Integer.parseInt(verkoopAantal.getText());
                voorstelling.verkoopKaartje(aantal);
            } 
            else if (e.getSource() == annuleerButton) {
                aantal = Integer.parseInt(annuleerAantal.getText());
                voorstelling.annuleerKaartje(aantal);
            }
        } catch (NumberFormatException nfe) {
                geenGetal.setText("Voer een getal in");
            }
            
        // update labels en clear Textfield
        jlAantalPlaatsen.setText(String.valueOf(voorstelling.getAantalPlaatsen()));
        jlAantalVerkocht.setText(String.valueOf(voorstelling.getAantalVerkochtePlaatsen()));
        verkoopAantal.setText("");
        annuleerAantal.setText("");
    }
}
