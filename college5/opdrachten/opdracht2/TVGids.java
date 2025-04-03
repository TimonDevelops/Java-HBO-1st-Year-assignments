import java.util.ArrayList;

public class TVGids {

    public static void main(String[] args) {
        ArrayList<TVProgramma> TVgids = new ArrayList<>();
 
        TVProgramma show1 = new Talkshow("Go", 8, 3, "Joep", "Coding");
        TVgids.add(show1);
        TVProgramma show2 = new Talkshow("Wonders", 20, 2, "Jens", "Nature");
        TVgids.add(show2);
        TVProgramma serie1 = new Serie("Casa", 40, 1, "Jackie", 1);
        TVgids.add(serie1);
        TVProgramma serie2 = new Serie("Dxtr", 30, 4, "John", 5);
        TVgids.add(serie2);

        for (TVProgramma tvProgramma : TVgids) {
           System.out.println(tvProgramma);
        }
    }
}