public class Weerbericht {
    double temperatuur;
    int windkracht;
    String windrichting;
    boolean bewolking;
    boolean neerslag;
    boolean zon;

    // constructors
    public Weerbericht() {}
    
    public Weerbericht (double temperatuur, int windkracht, String windrichting) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        this.bewolking = false;
        this.neerslag = false;
        this.zon = true;
    }

    public Weerbericht (double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean neerslag, boolean zon) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        this.bewolking = bewolking;
        this.neerslag = neerslag;
        this.zon = zon;
    }

    //setters
    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }
    public void setWindkacht(int windkracht) {
        this.windkracht = windkracht;
    }
    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }
    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;
    }
    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
    }
    public void setZon(boolean zon) {
        this.zon = zon;
    }
    //getters
    public double getTemperatuur() {
        return temperatuur;
    }
    public int getWindkracht() {
        return windkracht;
    }
    public String getWindrichting() {
        return windrichting;
    }

    // toString
    public String toString() {
        String weerbericht = "Weerbericht: - temperatuur: " + temperatuur + ", wind: " + windkracht + " " + windrichting;
        if (neerslag) {
            weerbericht += ", neerslag";
        }
        if (bewolking) {
            weerbericht += ", bewolking";
        }
        if (zon) {
            weerbericht += ", zon";
        }
        return weerbericht;  
    }
}