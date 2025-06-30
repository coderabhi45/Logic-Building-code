
import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        list.clear();

        System.out.println("ArrayList after emptying: " + list);
    }
}
