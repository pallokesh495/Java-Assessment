class AccessModifiersClass {
    private AccessModifiersClass() {
        System.out.println("Private constructor");
    }

    public AccessModifiersClass(int a) {
        System.out.println("Public constructor");
    }

    protected AccessModifiersClass(int a, int b) {
        System.out.println("Protected constructor");
    }

    AccessModifiersClass(String str) {
        System.out.println("Default constructor: " + str);
    }

    public static void main(String[] args) {
        new AccessModifiersClass(10);
        new AccessModifiersClass(20, 30);
        new AccessModifiersClass("Hello");
    }
}
