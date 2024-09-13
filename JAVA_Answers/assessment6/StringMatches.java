public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean isMatch = str.matches("Hello\\d+");
        System.out.println("Does it match the pattern? " + isMatch);
    }
}
