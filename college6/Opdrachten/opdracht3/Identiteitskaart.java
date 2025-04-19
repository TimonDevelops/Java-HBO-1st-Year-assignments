public class Identiteitskaart extends Reisdocument {
    
    public Identiteitskaart(String naam, String BSN) {
        super(naam, BSN);
    }

    @Override
    public String getDocumentType() {
        return "Identiteitskaart";
    }

    @Override
    public String getGeldigeLanden() {
        return "reizen in Europa";
    }
}
