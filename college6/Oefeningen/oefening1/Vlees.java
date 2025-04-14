import java.time.LocalDate;

public class Vlees extends Voedsel implements Koelproduct { 
    String diersoort;
    int bewaarTemperatuur;

    public Vlees(LocalDate tht, String diersoort, int bewaarTemperatuur) {
        super(tht);
        this.diersoort = diersoort;
        this.bewaarTemperatuur = bewaarTemperatuur;
    }
    public int getBewaarTemperatuur() {
        return bewaarTemperatuur;
    }

    public String toString() {
        return "Diersoort: " + diersoort + ", Bewaren op: " + bewaarTemperatuur + "°C, Ten minste houdbaar tot: " + tht;
    }
}
