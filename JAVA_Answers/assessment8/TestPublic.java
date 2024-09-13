package package1;

public class TestPublic {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        System.out.println("Public field: " + example.publicField);
        example.publicMethod();
    }
}
