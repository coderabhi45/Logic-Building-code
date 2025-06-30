import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Cherry");

        list.add(0, "Apple"); // Insert at first position

        System.out.println("ArrayList after insertion: " + list);
    }
}
