import java.time.LocalDateTime;

public class Bericht {
    private Gebruiker afzender;
    private String bericht;
    private LocalDateTime datum;

    public Bericht(Gebruiker afzender, String bericht) {
        setAfzender(afzender);
        setBericht(bericht);
        setDatum();
    }
    // setters
    public void setAfzender(Gebruiker afzender) {
        this.afzender = afzender;
    }
    public void setBericht(String bericht) {
        this.bericht = bericht;
    }
    public void setDatum() {
        this.datum = LocalDateTime.now();
    }
    // getters
    public Gebruiker getAfzender() {
        return afzender;
    } 
    public String getBericht() {
        return bericht;
    }
    public LocalDateTime getDatum() {
        return datum;
    }
    public String toString() {
        return afzender + " Datum: " + datum + " Bericht: " + bericht;
    }
}