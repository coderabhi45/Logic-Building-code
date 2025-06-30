//Write a Java program to swap the first and last elements of an array and create a new arr


import java.util.Arrays;

public class question21{
    public static void main(String[] args) {
        int[] oArray = {10, 20, 30, 40, 50};


        int[] newArray = Arrays.copyOf(oArray, oArray.length);


        if (newArray.length > 1) {
            int temp = newArray[0];
            newArray[0] = newArray[newArray.length - 1];
            newArray[newArray.length - 1] = temp;
        }


        System.out.println("Original array: " + Arrays.toString(oArray));
        System.out.println("New array after swapping first and last elements: " + Arrays.toString(newArray));
    }
}
