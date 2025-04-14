import java.time.LocalDate;

public abstract class Voedsel {
    LocalDate tht;

    public Voedsel(LocalDate tht) {
        this.tht = tht;
    }

    public LocalDate getDate() {
        return tht;
    }
}