public class Werknemer extends Persoon {
    double salaris;
    public Werknemer(String n, int l) {
        super(n, l);
    }
    public void setSalaris(double s) {
        this.salaris = s;
    }
    public double getSalaris() {
        return this.salaris;
    }
    public void verhoogSalaris(double v) {
        salaris = salaris + v;
    }

    public String toString() {
        return super.toString() + " Salaris: " + salaris;
    }
}