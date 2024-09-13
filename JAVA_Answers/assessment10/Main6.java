class PublicClass implements PublicInterface {
   
    public void publicMethod() {
        System.out.println("Public method.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Field value: " + PublicInterface.FIELD);
        obj.publicMethod();
    }
}
