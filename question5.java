/*Write a Java program that takes five numbers as input to calculate and print the average of the
numbers*/


import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a =sc.nextInt();
        System.out.print("Enter the Second number = ");
        int b=sc.nextInt();
        System.out.print("Enter the Third number= ");
        int c=sc.nextInt();
        System.out.print("Enter the forth number= ");
        int d=sc.nextInt();
        System.out.print("Enter the fifth number= ");
        int e=sc.nextInt();



        int Avg= a+b+c+d+e;

        System.out.print("The average of five numberm= "+Avg);

    }
}

