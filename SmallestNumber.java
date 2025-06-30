public class SmallestNumber {


    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    public static void main(String[] args) {

        int num1 = 25, num2 = 12, num3 = 30;

        int result = findSmallest(num1, num2, num3);

        System.out.println("The smallest number is: " + result);
    }
}
