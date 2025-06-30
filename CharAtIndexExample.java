//8

import java.util.Scanner;

public class CharAtIndexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input index
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        // Check if index is valid
        if (index >= 0 && index < input.length()) {
            char result = input.charAt(index);
            System.out.println("Character at index " + index + " is: " + result);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (input.length() - 1));
        }

        scanner.close();
    }
}
