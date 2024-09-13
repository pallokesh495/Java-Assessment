public class ClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");  // Generates ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
