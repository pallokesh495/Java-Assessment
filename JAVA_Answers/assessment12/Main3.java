class MultiConstructorClass {
    MultiConstructorClass() {
        this(100); // Calling another constructor
        System.out.println("Default constructor");
    }

    MultiConstructorClass(int a) {
        System.out.println("One-argument constructor: " + a);
    }
}

public class Main3 {
    public static void main(String[] args) {
        MultiConstructorClass obj = new MultiConstructorClass();
    }
}
