import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Hoofdscherm extends JFrame implements ActionListener {
    
    private JTextField tekst;
    private JButton loginBtn;

    public Hoofdscherm() {

        setSize(400, 300);
        setTitle("Inloggen");
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);


        loginBtn = new JButton("inloggen");
        loginBtn.addActionListener(this);
        tekst = new JTextField(20);
        add(loginBtn);
        add(tekst);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // maak dialog aan met deze frame instantie als ouder en "dialoog" als kind
        MijnDialoog dialoog = new MijnDialoog(this);
        dialoog.setVisible(true);
    }
}

