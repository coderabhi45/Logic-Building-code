//Write a Java program to compute the sum of the first 100 prime numbers


public class question20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}