import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Weerbericht {
    double temperatuur;
    int windkracht;
    String windrichting;
    boolean bewolking;
    boolean neerslag;
    boolean zon;
    private LocalDate datum;
    private DateTimeFormatter datumFormat;

    // constructors
    public Weerbericht() {}
    
    public Weerbericht (double temperatuur, int windkracht, String windrichting) {
        this (temperatuur, windkracht, windrichting, false, false, true);
    }

    public Weerbericht (double temperatuur, int windkracht, String windrichting, boolean neerslag, boolean bewolking, boolean zon) {
        setTemperatuur(temperatuur);
        setWindkracht(windkracht);
        setWindrichting(windrichting);
        setBewolking(bewolking);
        setNeerslag(neerslag);
        setZon(zon);
    }

    //setters
    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }
    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }
    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }
    public void setNeerslag(boolean neerslag) {
        if (neerslag) {
            this.neerslag = neerslag;
            this.bewolking = true;
            this.zon = false;
        }
        else this.neerslag = neerslag;
    }
    public void setBewolking(boolean bewolking) {
        if (bewolking) {
        this.bewolking = bewolking;
        this.zon = false;
        }
        else {
            this.bewolking = bewolking;
            this.neerslag = false;
            this.zon = true;
        }
    }
    public void setZon(boolean zon) {
        if (zon) {
            this.zon = zon;
            this.bewolking = false;
            this.neerslag = false;
        }
        else {
            this.zon = zon;
            this.bewolking = true;
        }
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
    public String getDagVanDeWeek() {
        datum = LocalDate.now();
        datumFormat = DateTimeFormatter.ofPattern("eeee");
        String dag = datum.format(datumFormat);
        return dag;
    }
    // toString
    public String toString() {
        String weerbericht = "Weerbericht " + getDagVanDeWeek() + " - temperatuur: " + temperatuur + ", wind: " + windkracht + " " + windrichting;
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