
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num != 0);

        System.out.println("Number of digits: " + count);
    }
}
