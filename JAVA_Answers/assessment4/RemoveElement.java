import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] arr, int value) {
        return Arrays.stream(arr).filter(e -> e != value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arr = removeElement(arr, 30);
        System.out.println("Array after removal: " + Arrays.toString(arr));
    }
}
