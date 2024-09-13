public class PrivateExample {
    private int privateField = 10;
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        System.out.println("Private field: " + example.privateField);
        example.privateMethod();
    }
}
