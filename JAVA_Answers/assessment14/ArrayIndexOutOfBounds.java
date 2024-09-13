public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[10] = 50;  // Generates ArrayIndexOutOfBoundsException
    }
}
