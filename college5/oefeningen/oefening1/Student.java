public class Student 
    extends Persoon {

    private int studentnr;

    public Student(String n, int l, int s) {
        super(n, l);
        setStudentnr(s);
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
    }
    public int getStudentnr() {
        return studentnr;
    }

    public String toString() {
        return "Naam: " + this.getNaam() + " Lengte: " + this.getLengte() + " Studentnr: " + studentnr;
    }
}