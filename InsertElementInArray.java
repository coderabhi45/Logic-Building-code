
//8

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input original array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element to insert
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        // Input position to insert (0-based index)
        System.out.print("Enter the position to insert (0 to " + n + "): ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
            scanner.close();
            return;
        }

        // Create new array with size n+1
        int[] newArr = new int[n + 1];

        // Copy elements before position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element at position
        newArr[pos] = element;

        // Copy remaining elements after position
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print new array
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
