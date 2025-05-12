import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;

public class DemoFrame extends JFrame implements ActionListener{

	private JLabel jlNaam;
	private JTextField jtfNaam;
	private JTextField jtfLeeftijd;
	private JButton jbOK;

    public DemoFrame() {
		setTitle("Titel");
		setSize(600, 200);
		setLayout(new FlowLayout());
		jlNaam = new JLabel("naam");
		add(jlNaam);
		jtfNaam = new JTextField(10);
		add(jtfNaam);
		jtfLeeftijd = new JTextField(10);
		add(jtfLeeftijd);
		jbOK = new JButton("OK");
		add(jbOK);
		jbOK.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String ingevoerdeNaam = jtfNaam.getText();
		String ingevoerdeLeeftijd = jtfLeeftijd.getText();
		System.out.println("De ingevoerde naam is " + ingevoerdeNaam + ", leeftijd: " + ingevoerdeLeeftijd);
	}
}
