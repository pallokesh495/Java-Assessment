package package2;

import package1.PublicExample;

public class TestPublicAccess {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        System.out.println("Public field: " + example.publicField);
        example.publicMethod();
    }
}
