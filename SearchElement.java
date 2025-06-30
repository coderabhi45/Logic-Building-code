// Search for a Key in an Array


import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " is found in the array.");
        else
            System.out.println(key + " is not found in the array.");
    }
}
