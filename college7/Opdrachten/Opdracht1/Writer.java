import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("bestandsnaam.txt");
            writer.println("hoofdstuk 1");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
