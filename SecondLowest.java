//Write a Java program to find second lowest number from the array



public class SecondLowest {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 22, 4, 19, 4, 33};

        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest && num != lowest) {
                secondLowest = num;
            }
        }

        if (secondLowest == Integer.MAX_VALUE) {
            System.out.println("There is no second lowest element (all elements may be equal).");
        } else {
            System.out.println("Second lowest number is: " + secondLowest);
        }
    }
}
