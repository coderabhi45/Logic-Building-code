//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn


import java.util.Scanner;

public class fourteen14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        String n = scanner.next();


        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(n + n);
        int num3 = Integer.parseInt(n + n + n);

        int result = num1 + num2 + num3;

        System.out.println("The result of n + nn + nnn is: " + result);


    }
}
