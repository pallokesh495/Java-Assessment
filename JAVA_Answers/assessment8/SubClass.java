public class SubClass extends PrivateExample {
    public void accessPrivate() {
        // The following lines will cause compilation errors because private fields/methods are not accessible in subclasses
        // System.out.println("Private field: " + privateField);
        // privateMethod();
    }
}
