public class FinallyBlock{
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("This is finally block");
        }
    }
}
