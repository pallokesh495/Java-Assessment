public class Throws {
    public static void riskyMethod() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void main(String[] args) {
        riskyMethod();  // No try block
    }
}
