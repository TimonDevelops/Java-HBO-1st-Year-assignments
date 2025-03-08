public class Weerbericht {
    double temperatuur;
    int windkracht;
    String windrichting;
    boolean bewolking;
    boolean neerslag;
    boolean zon;

    public void weerbericht(double temperatuur, int windkracht, String windrichting) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        this.bewolking = false;
        this.neerslag = false;
        this.zon = true;
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
    public double getTemperatuur(double temperatuur) {
        return temperatuur;
    }
    public int getWindkracht(int windkracht) {
        return windkracht;
    }
    public String getWindrichting(String windrichting) {
        return windrichting;
    }
}