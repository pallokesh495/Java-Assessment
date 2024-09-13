public class DifferenceMinMax {
    public static int findDifference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};
        System.out.println("Difference between largest and smallest: " + findDifference(arr));
    }
}
