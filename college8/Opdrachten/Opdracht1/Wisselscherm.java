import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Wisselscherm extends JFrame implements ActionListener {
    Wisselkoers wisselkoers;
    JPanel euroPanel;
    JPanel dollarPanel;
    JLabel euro;
    JLabel dollar;
    JTextField euroAmount;
    JTextField dollarAmount;
    JButton euroDollarBtn;
    JButton dollarEuroBtn;

    public Wisselscherm(Wisselkoers wisselkoers) {
        this.wisselkoers = wisselkoers;

        // settings
        setTitle("Euro - Dollar converter");
        setSize(500, 100);
        setLayout(new FlowLayout(FlowLayout.LEFT,10, 20));

        // Euro
        euro = new JLabel("€");
        euroAmount = new JTextField(8);


        // Buttons
        euroDollarBtn = new JButton(">>");
        dollarEuroBtn = new JButton("<<");

        // Dollar
        dollar = new JLabel("$");
        dollarAmount = new JTextField(10);

        // Buttons zelfde hoogte als textfields
        Dimension fieldSize = euroAmount.getPreferredSize();
        euroDollarBtn.setPreferredSize(new Dimension(50, fieldSize.height));
        dollarEuroBtn.setPreferredSize(new Dimension(50, fieldSize.height));

        // addings
        add(euro);
        add(euroAmount);
        add(euroDollarBtn);
        add(dollarEuroBtn);
        add(dollar);
        add(dollarAmount);

        // actionListeners adding
        euroDollarBtn.addActionListener(this);
        dollarEuroBtn.addActionListener(this);
        
        setVisible(true);

        //logica

    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == euroDollarBtn) {
            double bedragEuro = Double.parseDouble(euroAmount.getText());
            double bedrag = Math.round(wisselkoers.munt1NaarMunt2(bedragEuro) * 100.0) / 100.0;
            dollarAmount.setText(String.valueOf(bedrag));
            System.out.println("Euro: " + bedragEuro);
        }
        else if (e.getSource() == dollarEuroBtn) {
            double bedragDollar = Double.parseDouble(dollarAmount.getText());
            double bedrag = Math.round(wisselkoers.munt2NaarMunt1(bedragDollar) * 100.0) /100.0;
            euroAmount.setText(String.valueOf(bedrag));
            System.out.println("Dollar: " + bedragDollar);
        }
    }
}
