public class ContainsValue {
    public static boolean contains(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Contains 30: " + contains(arr, 30));
    }
}
