//Segregate 0s and 1s in an Array

import java.util.Arrays;

public class SegregateZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) left++;
            while (arr[right] == 1 && left < right) right--;

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Segregated array: " + Arrays.toString(arr));
    }
}

