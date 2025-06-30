
import java.util.Scanner;

public class CubeUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is: " + i + " and cube is: " + (i * i * i));
        }
    }
}
