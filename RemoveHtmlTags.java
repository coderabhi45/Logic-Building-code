//1

import java.util.Scanner;

public class RemoveHtmlTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with HTML tags: ");
        String input = scanner.nextLine();

        // Remove all HTML tags using regex
        String result = input.replaceAll("<[^>]*>", "");

        System.out.println("String without HTML tags: " + result);

        scanner.close();
    }
}
