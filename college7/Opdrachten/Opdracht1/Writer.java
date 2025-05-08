import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("bestand.txt");
            writer.println("hoofdstuk 1");

            String[] namen = new String[]{"Michiel", "Amy", "Joost"};
            for (int i = 0; i < 4; i++) {
                writer.println(namen[i]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Bestand kan niet gemaakt worden: " + ex.getMessage());
        } finally {
            writer.close();
        }
    }
}
