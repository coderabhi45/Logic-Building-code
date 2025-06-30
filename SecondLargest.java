//Write a Java program to find second largest number from the array


public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 89, 34, 67};

        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements may be equal).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}

