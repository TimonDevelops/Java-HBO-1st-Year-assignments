public class Circus {
    private Artiest[] artiesten;

    public Circus() {
        this.artiesten = new Artiest[] {
            new Artiest("Aap"),
            new Artiest("Noot"),
            new Artiest("Mies")
        };
    }
    public void printArtiesten() {
        int i = 0;
        for (Artiest artiest : artiesten) {
            i += 1;
            System.out.println("Artiest " + i + ": " + artiest.toString());
        }
        // classic
        // for (int i = 0; i < artiesten.length; i++) {
        //     System.out.println("Artiest " + i + ": " + artiesten[i].toString());
        // }
        }
    public void getAantalArtiesten() {
        int aantal = artiesten.length;
        System.out.println("Aantal artiesten: " + aantal);
    }
    }
