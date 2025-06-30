//3

import java.util.Scanner;

public class TrimStringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        // Trim the string
        String trimmedString = input.trim();

        // Display the result
        System.out.println("Original string: \"" + input + "\"");
        System.out.println("Trimmed string: \"" + trimmedString + "\"");

        scanner.close();
    }
}

