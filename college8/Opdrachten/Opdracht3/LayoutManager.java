import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutManager extends JFrame {
    JLabel[][] blokArray;
    JTextField field1;
    JTextField field2;
    Color achtergrondKleur = Color.CYAN;

    public LayoutManager() {
        setTitle("Layout Manager");
        setSize(600, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel paneelBlokken = new JPanel();
        paneelBlokken.setLayout(new GridLayout(3, 3, 5, 5));
        blokArray = new JLabel[3][3];
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        field1 = new JTextField();
        field2 = new JTextField();
        JButton kleurBtn = new JButton("Kleur");
        Dimension d = kleurBtn.getPreferredSize();
        field1.setPreferredSize(d);
        field2.setPreferredSize(d);

        // Eventlistener
        kleurBtn.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int veld1 = Integer.parseInt(field1.getText());
                int veld2 = Integer.parseInt(field2.getText());;
                blokArray[veld1][veld2].setBackground(Color.RED);
            }
            public void mouseReleased(MouseEvent e) {            
                int veld1 = Integer.parseInt(field1.getText());
                int veld2 = Integer.parseInt(field2.getText());
                blokArray[veld1][veld2].setBackground(achtergrondKleur);
            }
        });

        // addings
        add(paneelBlokken, BorderLayout.CENTER);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j ++) {
                blokArray[i][j] = maakLabel();
                paneelBlokken.add(blokArray[i][j]);
            }
        }
        buttonPanel.add(field1);
        buttonPanel.add(field2);
        buttonPanel.add(kleurBtn);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    // blauwe blokken maker
    private JLabel maakLabel() {
        JLabel blok = new JLabel();
        blok.setOpaque(true);
        // blok.setPreferredSize(new Dimension(80, 80));
        blok.setBackground(achtergrondKleur);
        blok.setBorder(BorderFactory.createLineBorder(Color.BLUE.darker()));
        return blok;
    }
}
