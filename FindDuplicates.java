//Write a Java program to find the duplicate values of an array of integer values


import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values in the array: " + duplicates);
        }
    }
}
