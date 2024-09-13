public class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        System.out.println("Starts With 'hel': " + str1.startsWith("hel"));
        System.out.println("Ends With 'llo': " + str1.endsWith("llo"));
        System.out.println("Compare To: " + str1.compareTo(str2));
    }
}
