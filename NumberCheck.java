
public class NumberCheck {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 42;

        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }
}
