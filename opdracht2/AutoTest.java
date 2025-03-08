public class AutoTest {
    public Auto auto1;
    public Auto auto2;
    static int maxOpvoerPks;

    // main method
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        System.out.println(auto1);
        auto1.setMerk("Skoda");
        auto1.setType("Fabia");
        auto1.setPk(60);
        System.out.println(auto1);
        Auto auto2 = new Auto();
        auto2.setMerk("Tesla");
        auto2.setType("S");
        auto2.setPk(400);
        System.out.println(auto2);
        String pkTest = verschil(auto1, auto2);
        System.out.println(pkTest);
        while (auto1.getPK() < auto2.getPK() && !auto1.getOpgevoerd()) {
            maxOpvoerPks = auto1.getMaxVermogen();
            auto1.voerOp(maxOpvoerPks);
            }
      }

      // methods 
    public static String verschil(Auto auto1, Auto auto2) {
        pkVerschil verschil = new pkVerschil(auto1, auto2);
        if (verschil.verschil > 0) {
            return "de " + verschil.sneller + " heeft meer vermogen dan de " + verschil.langzamer + ", het verschil is " + verschil.verschil + " pk";
        }
        else {
            return auto1.merk + "en" + auto2.merk + "hebben evenveel vermogen " + auto1.pk + " pk";
        }
    }

    // class
    public static class pkVerschil {
        Auto auto1;
        Auto auto2;
        int verschil1;
        int verschil2;
        int verschil;
        String sneller;
        String langzamer;
        
        public pkVerschil(Auto auto1, Auto auto2) {
            this.auto1 = auto1;
            this.auto2 = auto2;
            this.verschil1 = auto1.getPK() - auto2.getPK();
            this.verschil2 = auto2.getPK() - auto1.getPK();
            this.verschil = 0;
            if (verschil1 > 0) {
                this.verschil = verschil1;
                this.sneller = auto1.merk;
                this.langzamer = auto2.merk;
            }
            else if (verschil2 > 0) {
                this.verschil = verschil2;
                this.sneller = auto2.merk;
                this.langzamer = auto1.merk;
            }
        }
    }
}
    