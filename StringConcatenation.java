
public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String first = "Hello, ";
        String second = "World!";

        String result = concatenateStrings(first, second);
        System.out.println("Concatenated String: " + result);
    }
}
