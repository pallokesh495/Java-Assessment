import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int value : set) {
            result[i++] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10};
        arr = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(arr));
    }
}
