public class LegitimatieTest {

    public static void main(String[] args) {
        Rijbewijs rijbewijs1 = new Rijbewijs("Richard", "9283470HJ32LK", "B");
        System.out.println(rijbewijs1.getDocumentType());
        System.out.println(rijbewijs1.getNaam());
        System.out.println(rijbewijs1.getBSN());
        System.out.println(rijbewijs1);
    }

}