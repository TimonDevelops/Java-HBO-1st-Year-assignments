import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIApplicatie extends JFrame {
    
    public GUIApplicatie() {
        setTitle("GUIApplicatie");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel oost = new JLabel("oost");
        oost.setOpaque(true);
        oost.setBackground(Color.RED);
        oost.setBounds(10, 20, 30 ,80);
        setLayout(null);

        // addings
        add(oost);






        setVisible(true);
    }   
}
