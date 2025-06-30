//Write a Java program to convert an array to ArrayList

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        // Convert array to ArrayList using Arrays.asList()
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruits));

        System.out.println("ArrayList: " + fruitList);
    }
}
