
//5

import java.util.Scanner;

public class ReplaceCharacterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace all 'd' with 'f'
        String replacedString = input.replace('d', 'f');

        // Display the result
        System.out.println("Modified string: " + replacedString);

        scanner.close();
    }
}
