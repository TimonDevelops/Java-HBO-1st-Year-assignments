import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
        Oost.setBounds(10, 10, 80 ,80);
        JLabel West = new JLabel("West");
        West.setOpaque(true);
        West.setBackground(Color.CYAN);
        West.setBounds(100, 10, 80 ,80);
        JLabel Noord = new JLabel("Noord");
        Noord.setOpaque(true);
        Noord.setBackground(Color.GREEN);
        Noord.setBounds(200, 10, 80 ,80);
        JLabel Zuid = new JLabel("Zuid");
        Zuid.setOpaque(true);
        Zuid.setBackground(Color.YELLOW);
        Zuid.setBounds(150, 300, 80 ,80);
        JLabel Centrum = new JLabel("Centrum");
        Centrum.setOpaque(true);
        Centrum.setBackground(Color.ORANGE);
        Centrum.setBounds(160, 160, 80 ,80);

        setLayout(new BorderLayout(0 ,0));

        // visual changes
        Dimension d = new Dimension(400, 100);
        Zuid.setPreferredSize(d);
    
        // addings
        add(Oost, BorderLayout.EAST);
        add(West, BorderLayout.WEST);
        add(Centrum);
        add(Noord, BorderLayout.NORTH);
        add(Zuid, BorderLayout.SOUTH);
        

        setVisible(true);
    }   
}
