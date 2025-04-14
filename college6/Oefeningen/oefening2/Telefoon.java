public class Telefoon implements Comparable<Telefoon>{
    String merk;
    String type;
    int prijs;

    public Telefoon(String m, String t, int p) {
        merk = m;
        type = t;
        prijs = p;
    }

    public int getPrijs() {
        return prijs;
    }
    public String getMerk() {
        return merk;
    }
    public int compareTo(Telefoon andere) {
        return this.prijs - andere.prijs;
    }

    public String toString() {
        return "Merk: " + merk + ", Type: " + type + ", Prijs: " + prijs;
    }
}
