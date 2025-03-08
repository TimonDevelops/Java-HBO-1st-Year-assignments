public class Auto {
    public String merk = "merk onbekend";
    public String type = "";
    public int pk = 20;
    private boolean opgevoerd;

    // empty constructor
    public Auto () {}

    // constructor
    // public Auto(String merk, String type, int pk) {
    //     this.merk = merk;
    //     this.type =type;
    //     this.pk = pk;
    // }

    // setters
    public void setMerk(String merk ) {
       this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }
        
    public void setPk(int pk) {
        this.pk = pk;
    }

    public void setOpgevoerd(boolean set) {
        this.opgevoerd = set;
    }

    // getters
    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }
     
    public int getPK() {
        return pk;
    }
    
    public int getMaxVermogen() {
        if (opgevoerd) {
            return 0;
        }
        return pk - 20;
    }

    public boolean getOpgevoerd() {
        return opgevoerd;
    }

    public String toString() {
        if (opgevoerd) {
            return merk + " " + type + "(" + pk + " pk, is al opgevoerd)";
        }
        else return merk + " " + type + " (" + pk + "pk, maximaal op te voeren met " + getMaxVermogen() + ")";
    }
    public  void  voerOp(int extraPk) {
        
        if (extraPk > getMaxVermogen()) {
            System.out.println(merk + " opvoeren met " + extraPk + " pk"); 
            System.out.println(extraPk + " is teveel, maximaal " + getMaxVermogen());
        }
        else { 
            System.out.println(merk + " opvoeren met " + extraPk + " pk"); 
            pk += extraPk;
            setOpgevoerd(true);
        }
        System.out.println("resultaat: " + this.toString());
    }        
}