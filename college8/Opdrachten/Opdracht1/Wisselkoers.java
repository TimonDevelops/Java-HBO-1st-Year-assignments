public class Wisselkoers {
    Munt munt1;
    Munt munt2;
    double koers;

    public Wisselkoers(Munt munt1, Munt munt2, Double koers) {
        this.munt1 = munt1;
        this.munt2 = munt2;
        this.koers = koers;
    }

    public double munt1NaarMunt2(double bedrag) {
        double resultaat = bedrag * koers;
        return resultaat;
    }

    public double munt2NaarMunt1(double bedrag) {
        double koersDollarEuro = 1.0 / koers;
        double resultaat = koersDollarEuro * bedrag;
        return resultaat;
    }
}
