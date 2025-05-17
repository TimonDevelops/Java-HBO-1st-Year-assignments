import javax.swing.JFrame;

public class WisselTest {
    public static void main(String[] args) {
        Munt euro = new Munt("Euro", "€");
        Munt dollar = new Munt("Dollar", "$");

        Wisselkoers koers = new Wisselkoers(euro, dollar, 1.12);
        Wisselscherm scherm = new Wisselscherm(koers);
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
