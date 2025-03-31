import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
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
    private int dagTeller;

    // constructors
    public Weerbericht() {
    this (0, 0, "Geen", false, false, true);
    }
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
        }
        else this.neerslag = neerslag;
    }
    public void setBewolking(boolean bewolking) {
        if (bewolking) {
        this.bewolking = bewolking;
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
        datum = LocalDate.now().plusDays(this.dagTeller);
        datumFormat = DateTimeFormatter.ofPattern("eeee");
        String dag = datum.format(datumFormat);
        return dag;
    }
    public ImageIcon getWeerAfbeelding() {
        ImageIcon afbeelding;
        if (bewolking) {
            if (neerslag) {
                if (temperatuur <=0.0) {
                    if (zon) {
                        afbeelding = new ImageIcon("zon-sneeuw.png");
                        return afbeelding;
                    }
                    else {
                        afbeelding = new ImageIcon("sneeuw.png");
                        return afbeelding;
                    }
                }
                else if (zon) {
                    afbeelding = new ImageIcon("zon-regen.png");
                    return afbeelding;
                }
                else { 
                    afbeelding = new ImageIcon("regen.png");
                    return afbeelding;
                }
            }
            else if (zon) {
                afbeelding = new ImageIcon("zon-wolk.png");
                return afbeelding;
            }
            else {
                afbeelding = new ImageIcon("wolk.png");
                return afbeelding;
            }
        }
        else {
            afbeelding = new ImageIcon("zon.png");
            return afbeelding;
        }
    }
    
    public void verhoogDag() {
        this.dagTeller = 1;
    }
    
    public void verhoogDag(int dagTeller) {
        this.dagTeller += dagTeller;
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