public class Knikkerdeler {
    public int bereken(int knikkers, int personen) {
        if (personen <= 0) {
            throw new IllegalArgumentException("Aantal personen moet meer zijn dan 0");
        }
        return knikkers / personen;
    }
}