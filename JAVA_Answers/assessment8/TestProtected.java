package package1;

public class TestProtected {
    public static void main(String[] args) {
        ProtectedExample example = new ProtectedExample();
        System.out.println("Protected field: " + example.protectedField);
        example.protectedMethod();
    }
}
