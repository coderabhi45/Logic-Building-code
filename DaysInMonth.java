// Find Number of Days in a Month
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    days = 29;
                else
                    days = 28;
            }
            default -> {
                System.out.println("Invalid month.");
                return;
            }
        }

        System.out.println("Number of days: " + days);
    }
}
