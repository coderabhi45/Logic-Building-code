
public class DigitSum {

    public static int sumOfDigits(int number) {
        int sum = 0;

        number = Math.abs(number);

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
}
