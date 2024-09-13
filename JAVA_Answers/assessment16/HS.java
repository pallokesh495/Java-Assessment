import java.util.HashSet;

public class HS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grapes");
        set.add("Honeydew");
        set.add("Icedberry");
        set.add("Jackfruit");

        set.add("Kiwi");

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);

        set.remove("Date");

        int setSize = set.size();
        System.out.println("Size of HashSet: " + setSize);

        set.clear();
        System.out.println("Size of HashSet after clearing: " + set.size());
    }
}
