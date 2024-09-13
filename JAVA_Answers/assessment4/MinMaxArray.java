public class MinMaxArray {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 25, 1};
        int[] result = findMinMax(arr);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}
