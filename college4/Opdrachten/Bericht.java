import java.time.LocalDateTime;

public class Bericht {
    private String afzender;
    private String bericht;
    private LocalDateTime datum;

    public Bericht(String afzender, String bericht) {
        setAfzender(afzender);
        setBericht(bericht);
        setDatum();
    }
    // setters
    public void setAfzender(String afzender) {
        this.afzender = afzender;
    }
    public void setBericht(String bericht) {
        this.bericht = bericht;
    }
    public void setDatum() {
        this.datum = LocalDateTime.now();
    }
    // getters
    public String getAfzender() {
        return afzender;
    } 
    public String getBericht() {
        return bericht;
    }
    public LocalDateTime getDatum() {
        return datum;
    }
    public String toString() {
        return afzender + " " + datum + ": " + bericht;
    }
}