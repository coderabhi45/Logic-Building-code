import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("Square root of a negative number is not a real number.");
        } else {

            double squareRoot = Math.sqrt(number);

            System.out.println("Square root of " + number + " is: " + squareRoot);
        }

        scanner.close();
    }
}
