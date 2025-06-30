import java.util.Scanner;

public class AddWithoutArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Logic to add without using arithmetic operators
        while (b != 0) {
            // Carry now contains common set bits of a and b
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println("Sum = " + a);
    }
}
