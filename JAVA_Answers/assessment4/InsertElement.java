import java.util.Arrays;

public class InsertElement {
    public static int[] insertElement(int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = value;
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        arr = insertElement(arr, 25, 2);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }
}
