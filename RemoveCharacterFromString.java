//9

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input the character to remove
        System.out.print("Enter the character to remove: ");
        char chToRemove = scanner.next().charAt(0);

        // Remove the character using replace method
        String result = input.replace(Character.toString(chToRemove), "");

        // Output the result
        System.out.println("String after removing '" + chToRemove + "': " + result);

        scanner.close();
    }
}

