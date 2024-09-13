public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
