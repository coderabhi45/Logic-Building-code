
import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Swap first and third
        Collections.swap(list, 0, 2);

        System.out.println("ArrayList after swapping: " + list);
    }
}
