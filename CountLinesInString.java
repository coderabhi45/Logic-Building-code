//2

import java.util.Scanner;

public class CountLinesInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a multi-line string (type 'END' in a new line to finish):");

        StringBuilder inputBuilder = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            inputBuilder.append(line).append("\n");
        }

        String input = inputBuilder.toString();

        // Count the lines by splitting on line breaks
        String[] lines = input.split("\\r?\\n");

        System.out.println("Total number of lines: " + lines.length);

        scanner.close();
    }
}
