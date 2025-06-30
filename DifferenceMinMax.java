//Get Difference Between Largest and Smallest Values in an Array

public class DifferenceMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 5, 76, 1, 44, 99};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int difference = max - min;
        System.out.println("Difference between max and min: " + difference);
    }
}
