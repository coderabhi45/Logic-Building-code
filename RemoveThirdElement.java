
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        if (list.size() >= 3) {
            list.remove(2); // Remove element at index 2 (third element)
        }

        System.out.println("ArrayList after removal: " + list);
    }
}
