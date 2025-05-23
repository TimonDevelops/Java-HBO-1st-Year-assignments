import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CoffeeToGo extends JFrame implements ActionListener {

    private JButton jbKoffie;
    private JButton jbAnnuleren;
    private Bestelling bestelling;

    public CoffeeToGo() {
        setTitle("Coffee to go");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        jbKoffie = new JButton("Koffie");
        jbKoffie.addActionListener(this);
        add(jbKoffie);

        jbAnnuleren = new JButton("Annuleren");
        jbAnnuleren.addActionListener(this);
        add(jbAnnuleren);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbAnnuleren) {
            dispose(); //  Applicatie wordt gesloten
        } else {
            bestelling = new Bestelling();
            int suiker = JOptionPane.showConfirmDialog(this, "Wilt u suiker?", "Keuze 1", JOptionPane.YES_NO_OPTION);
            if (suiker == JOptionPane.YES_OPTION) {
                bestelling.setSuiker(true);
            }
            int melk = JOptionPane.showConfirmDialog(this, "Wilt u melk?", "Keuze 2", JOptionPane.YES_NO_OPTION);
            if (melk == JOptionPane.YES_OPTION) {
                bestelling.setMelk(true);
            }
            String specialeWensen = JOptionPane.showInputDialog(this, "Speciale wensen", "Extra opties", JOptionPane.QUESTION_MESSAGE);
            if (specialeWensen != null) {
                bestelling.setSpecialeWensen(specialeWensen);
            }
            JOptionPane.showMessageDialog(this, bestelling.toString(), "Bestelling", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
