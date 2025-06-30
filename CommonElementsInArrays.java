//10

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array size and elements
        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array size and elements
        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Use sets to find common elements
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        // Print common elements
        if (common.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements:");
            for (int num : common) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
