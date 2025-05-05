import java.net.URL;
import java.net.URI;
import javax.swing.*;
import java.awt.FlowLayout;

public class voorbeeld1 {

    public static void main(String[] args) {
        JFrame scherm = new JFrame("Plaatje");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setLayout(new FlowLayout());
        scherm.setSize(400, 400);
        
        ImageIcon javaStrand;
        
        try {
            URL afbUrl = URI.create("url van een plaatje").toURL();
            javaStrand = new ImageIcon(afbUrl);
        } catch (Exception e){
            System.out.println("fout in url: standaardplaatje.");
            System.out.println(e.getMessage());
        }
        
        try {
        javaStrand = new ImageIcon("src/java....jpg");
        JLabel plaatje = new JLabel(javaStrand);
        scherm.add(plaatje);
        scherm.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}