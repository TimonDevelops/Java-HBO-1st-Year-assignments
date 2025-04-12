import javax.swing.JButton;
import javax.swing.JFrame;

public class schermMetKnop {
    public static void main(String[] args) {
        JFrame scherm = new JFrame("Teller");
        JButton knop = new JButton();
        knop.addActionListener(new Knopteller());
        scherm.add(knop);
        scherm.setVisible(true);
    }
}
