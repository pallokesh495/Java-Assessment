public class ArrayAverage {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average: " + calculateAverage(arr));
    }
}
