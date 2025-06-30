public class EvenOddCounter {
    public static void main(String[] args) {

        int[] numbers = {10, 21, 4, 7, 8, 13, 16, 25};

        int evenCount = 0;
        int oddCount = 0;


        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
