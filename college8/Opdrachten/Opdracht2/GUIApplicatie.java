import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUIApplicatie extends JFrame {
    
    public GUIApplicatie() {
        setTitle("GUIApplicatie");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Oost = new JLabel("Oost");
        Oost.setOpaque(true);
        Oost.setBackground(Color.RED);

        JLabel West = new JLabel("West");
        West.setOpaque(true);
        West.setBackground(Color.CYAN);

        JLabel Noord = new JLabel("Noord");
        Noord.setOpaque(true);
        Noord.setBackground(Color.GREEN);

        JLabel Zuid = new JLabel("Zuid");
        Zuid.setOpaque(true);
        Zuid.setBackground(Color.YELLOW);

        JLabel Centrum = new JLabel("Centrum");
        Centrum.setOpaque(true);
        Centrum.setBackground(Color.ORANGE);

        setLayout(new GridLayout(2, 3, 5 ,10));
    
        // addings
        add(Oost);
        add(West);
        add(Centrum);
        add(Noord);
        add(Zuid);
        

        setVisible(true);
    }   
}
