public class StringCreation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        StringBuilder sb = new StringBuilder("StringBuilder");
        String str4 = sb.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
