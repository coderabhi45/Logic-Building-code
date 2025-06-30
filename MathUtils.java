
public class MathUtils {


    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //find LCM using GCD
    public static int findLCM(int a, int b) {
        return (a / findGCD(a, b)) * b;
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
