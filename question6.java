//Write a Java program to swap two variables

public class question6 {
    public static void main(String[] args) {
        int a=5,b=6,temp;

        System.out.println("The orignal number is a= "+a+" and b= "+b);

        System.out.println("After swapping the number ");

        temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a+ " and b= "+b);
    }
}
