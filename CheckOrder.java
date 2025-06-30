//Check if Three Numbers are in Increasing or Decreasing Order

import java.util.Scanner;

public class CheckOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("Numbers are in increasing order.");
        } else if (a > b && b > c) {
            System.out.println("Numbers are in decreasing order.");
        } else {
            System.out.println("Numbers are neither strictly increasing nor decreasing.");
        }
    }
}

