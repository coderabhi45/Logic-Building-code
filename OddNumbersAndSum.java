
import java.util.Scanner;

public class OddNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of odd terms: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("First " + n + " odd natural numbers:");
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
