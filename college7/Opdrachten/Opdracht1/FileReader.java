import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {

        public static void main(String[] args) {

            Scanner scanner = null;
            try {
                File f = new File("bestand.txt");
                scanner = new Scanner(f);
                System.out.println("Dit is de inhoud van het bestand: ");
        
                while (scanner.hasNext()) {
                    System.out.println(scanner.next());
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Exception: " + ex.getMessage());
            } finally {
                if (scanner != null)
                {
                    scanner.close();
                }
            }

    }
}