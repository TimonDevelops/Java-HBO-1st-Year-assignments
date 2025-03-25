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
        for (int i = 0; i < artiesten.length; i++) {
            System.out.println("Artiest " + i + ": " + artiesten[i].toString());
        }
        }
    }
