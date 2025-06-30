//4

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String input = scanner.nextLine();

        // Input start and end positions
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();

        // Validate and extract substring
        if (start >= 0 && end <= input.length() && start < end) {
            String sub = input.substring(start, end);
            System.out.println("Substring from index " + start + " to " + end + " is: " + sub);
        } else {
            System.out.println("Invalid start or end index.");
        }

        scanner.close();
    }
}

