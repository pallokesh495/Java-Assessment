public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello World Example";
        String[] parts = str.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
