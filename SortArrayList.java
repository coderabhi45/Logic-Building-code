
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Date");
        list.add("Cherry");

        Collections.sort(list);

        System.out.println("Sorted ArrayList: " + list);
    }
}
