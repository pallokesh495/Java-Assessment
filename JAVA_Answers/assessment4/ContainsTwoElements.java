public class ContainsTwoElements {
    public static boolean containsTwoElements(int[] arr, int first, int second) {
        boolean containsFirst = false, containsSecond = false;
        for (int i : arr) {
            if (i == first) containsFirst = true;
            if (i == second) containsSecond = true;
        }
        return containsFirst && containsSecond;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 30, 23, 40};
        System.out.println("Contains 12 and 23: " + containsTwoElements(arr, 12, 23));
    }
}
