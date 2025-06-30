
import java.util.Scanner;

public class CheckEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("All numbers are equal.");
        else
            System.out.println("Numbers are not all equal.");
    }
}
