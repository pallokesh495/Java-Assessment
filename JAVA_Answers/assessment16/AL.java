import java.util.ArrayList;
import java.util.Iterator;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Icedberry");
        list.add("Jackfruit");

        list.add("Kiwi");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.add(3, "Lemon");

        list.remove("Banana");

        list.remove(2);

        list.set(4, "Mango");

        String elementAtIndex3 = list.get(3);
        System.out.println("Element at index 3: " + elementAtIndex3);

        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        boolean containsElement = list.contains("Mango");
        System.out.println("Contains 'Mango': " + containsElement);

        list.clear();
        System.out.println("Size of ArrayList after clearing: " + list.size());
    }
}
