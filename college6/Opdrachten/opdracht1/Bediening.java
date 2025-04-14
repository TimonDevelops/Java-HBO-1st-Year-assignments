import javax.swing.JButton;
import javax.swing.JFrame;

public class Bediening {
    
    public static void main(String[] args) {
    JFrame scherm = new JFrame("Bediening");
    JButton button = new JButton();
    button.addActionListener(new Schakelaar(true));
    scherm.add(button);
    scherm.setVisible(true);
    }
}