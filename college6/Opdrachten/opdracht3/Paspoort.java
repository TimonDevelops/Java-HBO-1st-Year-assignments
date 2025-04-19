public class Paspoort extends Reisdocument {

    public Paspoort(String naam, String BSN) {
        super(naam, BSN);
    }

    @Override
    public String getDocumentType() {
        return "Paspoort";
    }

    @Override
    public String getGeldigeLanden() {
        return "de hele wereld";
    }


}
