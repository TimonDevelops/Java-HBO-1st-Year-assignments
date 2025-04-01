public class Main {

    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Henk", 175);
        Persoon persoon2 = new Persoon("Carla", 167);
        Persoon student1 = new Student("Frits", 189, 1);
        Student student2 = new Student("Rik", 181, 2);
        System.out.println(persoon1);
        System.out.println(persoon2);
        System.out.println(student1);
        System.out.println(student2);
    }
}

