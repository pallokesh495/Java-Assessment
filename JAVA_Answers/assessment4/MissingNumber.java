public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // Sum of numbers 1 to 100
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12}; // 11 is missing
        System.out.println("Missing number: " + findMissingNumber(arr, 12));
    }
}
