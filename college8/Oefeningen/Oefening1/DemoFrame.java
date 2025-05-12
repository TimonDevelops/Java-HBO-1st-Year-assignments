import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;

public class DemoFrame extends JFrame implements ActionListener{

	private JButton jbOK;

    public DemoFrame() {
		setTitle("Titel");
		setSize(600, 200);
		setLayout(new FlowLayout());
		JLabel jlNaam = new JLabel("naam");
		add(jlNaam);
		JTextField jtfNaam = new JTextField(10);
		add(jtfNaam);
		jbOK = new JButton("OK");
		add(jbOK);
		jbOK.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Click");
	}
}
