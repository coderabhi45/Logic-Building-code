//6

import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the length of the string
        int length = input.length();

        // Display the result
        System.out.println("Length of the string is: " + length);

        scanner.close();
    }
}

