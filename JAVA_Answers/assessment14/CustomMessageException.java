public class CustomMessageException {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
