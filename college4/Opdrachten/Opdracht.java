public class Opdracht {

    public static void main(String[] args) {
        int aantal = 6;
        String berichten[] = new String[aantal];

        berichten[0] = "Hoi";
        berichten[1] = "Hoe gaat het";
        berichten[2] = "Goed! Met jou ook?";
        berichten[3] = "Prima, maar ik moet weer snel verder";
        berichten[4] = "Oké tot snel!";
        berichten[5] = "Doei!";

        System.out.println("Er zijn " + aantal + " berichten");

        for (String bericht : berichten) {
            System.out.println(bericht);
        }

    }
}



