public class Main {

    public static void main(String[] args) {
        int aantalBerichten = 10;
        Bericht[] berichten = new Bericht[aantalBerichten];
        Bericht bericht1 = new Bericht("Pietje Puk", "Hé hallo, hoe gaat het?");
        berichten[0] = bericht1;
        Bericht bericht2 = new Bericht("Bart Boer", "Gaat z'n gangetje, hoe is het met jou?");
        berichten[1] = bericht2;
        Bericht bericht3 = new Bericht("Pietje Puk", "Fijn, met mij gaat het goed");
        berichten[2] = bericht3;


        for(Bericht bericht : berichten) {
            if (bericht == null) {
                continue;
            }
            System.out.println(bericht);
        }
    }
}



