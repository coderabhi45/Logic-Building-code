//1

import java.util.Scanner;

public class ToLowerCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase
        String lowerCaseString = input.toLowerCase();

        // Display the result
        System.out.println("Lowercase version: " + lowerCaseString);

        scanner.close();
    }
}

