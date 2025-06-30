//5

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}
