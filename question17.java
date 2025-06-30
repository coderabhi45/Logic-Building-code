//Write a Java program to print the even numbers from 1 to 20

public class question17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                System.out.println(i);
            }
        }
    }
}

