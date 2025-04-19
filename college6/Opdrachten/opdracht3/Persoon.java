public class Persoon {
    private String naam;
    private Rijbewijs rijbewijs;
    private Reisdocument reisdocument;
    
    public Persoon(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
        this.naam = rijbewijs.getNaam();
    }

    public Persoon(Reisdocument reisdocument) {
    this.reisdocument = reisdocument;
    this.naam = reisdocument.getNaam();
    }

    public void setRijbewijs(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public void setReisdocument(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
    }

    public Legitimatiebewijs getLegitimatie() {
        if(rijbewijs != null) {
            return rijbewijs;
        }
        else if( reisdocument != null) {
            return reisdocument;
        }
        else return null;
    }

    public void toonOverzicht(){
        Boolean BSNBool = false;
        if (rijbewijs != null) {
            System.out.println(naam + ", BSN: " + rijbewijs.getBSN());
            BSNBool = true;
            System.out.println("   Rijbewijs, categorie " + rijbewijs.getCategorie());
        }
        if(reisdocument != null) {
            if(!BSNBool) {
                System.out.println(naam + ", BSN: " + reisdocument.getBSN());
            }
            System.out.println("   Reisdocument: " + reisdocument.getDocumentType() + ", " + reisdocument.getGeldigeLanden());
        }
        if(rijbewijs == null && reisdocument == null){
            System.out.println(naam + ", kan zich niet legitimeren");
        }
    }

    public String toString() {
        return "Persoon{naam=" + naam + ", rijbewijs=" + rijbewijs + ", reisdocument=" + reisdocument + "}";
    }
}
