//3. Sort Names Alphabetically java opy code

import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Zara", "John", "Adam", "Eve"};
        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order: " + Arrays.toString(names));
    }
}
