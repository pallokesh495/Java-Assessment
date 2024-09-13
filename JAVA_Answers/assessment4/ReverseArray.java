import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
