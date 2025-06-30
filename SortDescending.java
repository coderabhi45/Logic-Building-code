//Sort an Array in Descending Order java Copy code

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in Descending Order: " + Arrays.toString(arr));
    }
}
