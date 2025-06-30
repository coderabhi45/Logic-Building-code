//Find Number of Even and Odd Integers in an Array

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 66, 90, 17, 32};

        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

