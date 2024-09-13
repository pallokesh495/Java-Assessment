import java.lang.reflect.Field;

public class NoSuchFieldException {
    public static void main(String[] args) {
        try {
            Field field = String.class.getDeclaredField("nonExistentField");  // Generates NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("No such field: " + e.getMessage());
        }
    }
}
