public class AverageCalculator {


    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        int num1 = 10, num2 = 20, num3 = 30;
        double result = average(num1, num2, num3);

        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
    }
}
