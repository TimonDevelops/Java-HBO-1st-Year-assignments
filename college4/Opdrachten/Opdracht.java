import java.time.LocalDate;

public class Opdracht {

    public static void main(String[] args) {
        int aantal = 7;
        String berichten[][] = new String[aantal][2];

        berichten[0][0] = " Piet";
        berichten[0][1] = "Hoi";
        berichten[1][0] = "Jan";
        berichten[1][1] = "Hoe gaat het";
        berichten[2][0] = "Piet";
        berichten[2][1] = "Goed! Met jou ook?";
        berichten[3][0] = "Jan";
        berichten[3][1] = "Prima, maar ik moet weer snel verder";
        berichten[4][0] = "Piet";
        berichten[4][1] = "Oké tot snel!";
        berichten[5][0] = "Jan";
        berichten[5][1] = "Doei!";
        berichten[6][0] = "Dit gesprek vond plaats op: " + getDatum();

        System.out.println("Er zijn " + aantal + " berichten");

        for (int i = 0; i < aantal; i++) {
            if (berichten[i][1] == null) {
                System.out.println(berichten[i][0]);
            }
            else { 
                System.out.println(berichten[i][0] + " zegt: " + berichten[i][1]);
            }
        }
    }
    public static String getDatum() {
        LocalDate datum = LocalDate.now();
        return datum.toString();
    }
}



