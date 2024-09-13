import java.util.HashSet;

public class CommonValues {
    public static void findCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.println("Common value: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {30, 40, 50};
        findCommon(arr1, arr2);
    }
}
