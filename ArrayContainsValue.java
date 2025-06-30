//6

import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input value to check
        System.out.print("Enter the value to check: ");
        int value = scanner.nextInt();

        // Check if value exists in the array
        boolean found = false;
        for (int num : arr) {
            if (num == value) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Array contains the value " + value + ".");
        } else {
            System.out.println("Array does not contain the value " + value + ".");
        }

        scanner.close();
    }
}
