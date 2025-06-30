
import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(3); // Initial capacity 3

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Add more elements beyond initial capacity
        list.add("Date");
        list.add("Elderberry");

        System.out.println("ArrayList after adding elements: " + list);
    }
}
