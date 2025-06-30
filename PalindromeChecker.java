
public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;


        if (number < 0) {
            return false;
        }

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 12321;

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
