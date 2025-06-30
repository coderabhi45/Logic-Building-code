
public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 600:");
        for (int i = 1; i <= 600; i++) {
            int num = i, sum = 0, temp = num;
            int digits = String.valueOf(num).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
