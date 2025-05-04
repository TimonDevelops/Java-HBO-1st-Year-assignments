public class tryCatch {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        } catch (ArithmeticException ae) {
            System.out.println("delen door nul!");
        }
    }
}