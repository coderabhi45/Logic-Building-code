
//2

import java.util.Scanner;

public class ToUpperCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase
        String upperCaseString = input.toUpperCase();

        // Display the result
        System.out.println("Uppercase version: " + upperCaseString);

        scanner.close();
    }
}
