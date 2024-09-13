import java.util.Arrays;

public class CopyArray {
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int[] copiedArray = copyArray(arr);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
