public class Puzzelwoord implements Comparable<Puzzelwoord>{
String woord;

    public Puzzelwoord(String woord) {
        this.woord = woord;
    }

    public String getWoord() {
        return woord;
    }

    public int compareTo(Puzzelwoord andere) {
        return Integer.compare(this.woord.length(), andere.woord.length());
    }

    public String toString() {
        return "Puzzelwoord: " + woord;
    }
}
