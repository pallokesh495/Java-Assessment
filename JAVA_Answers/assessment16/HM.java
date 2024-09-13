import java.util.HashMap;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        studentMap.put(101, "John");
        studentMap.put(102, "Jane");
        studentMap.put(103, "Paul");
        studentMap.put(104, "Sara");
        studentMap.put(105, "Chris");
        studentMap.put(106, "Anna");
        studentMap.put(107, "Tom");
        studentMap.put(108, "Emma");
        studentMap.put(109, "Noah");
        studentMap.put(110, "Liam");

        studentMap.put(111, "Olivia");

        String studentName = studentMap.get(104);
        System.out.println("Student with ID 104: " + studentName);

        HashMap<Integer, String> studentMapCopy = new HashMap<>(studentMap);

        boolean keyExists = studentMap.containsKey(102);
        System.out.println("Key 102 exists: " + keyExists);

        boolean valueExists = studentMap.containsValue("Tom");
        System.out.println("Value 'Tom' exists: " + valueExists);

        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is HashMap empty: " + isEmpty);

        int mapSize = studentMap.size();
        System.out.println("Size of HashMap: " + mapSize);

        System.out.println("Keys in the map: " + studentMap.keySet());

        studentMap.remove(106);
        System.out.println("After removing key 106, size of HashMap: " + studentMap.size());

        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);
        System.out.println("Size of another HashMap: " + anotherMap.size());
    }
}
