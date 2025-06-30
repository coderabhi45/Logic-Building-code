
public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int number = 5;
        long fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
