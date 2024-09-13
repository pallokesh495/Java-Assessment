import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i)) {
                System.out.println("Duplicate found: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20};
        findDuplicates(arr);
    }
}
