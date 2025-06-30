//Write a Java program to print the ascii value of a given character

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

    }
}
