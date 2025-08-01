
import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }

        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }
}
