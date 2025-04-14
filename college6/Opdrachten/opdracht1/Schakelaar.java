import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schakelaar implements ActionListener {
boolean knopAan;

    public Schakelaar(boolean setting) {
        knopAan = setting;
        String set;
        if(knopAan) {
            set = "aan";
        }
        else {
            set = "uit";
        }
        System.out.println("Schakelaar gemaakt, het licht is " + set);
    }

    public void actionPerformed(ActionEvent e) {
        if(knopAan) {
            knopAan = !knopAan;
            System.out.println("Het licht is uit");
        }
        else {
            knopAan = true;
            System.out.println("Het licht is aan");
        }
    }
}
