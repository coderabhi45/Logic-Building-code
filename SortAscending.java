//1. Sort an Array in Ascending Order

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);

        System.out.println("Array in Ascending Order: " + Arrays.toString(arr));
    }
}
