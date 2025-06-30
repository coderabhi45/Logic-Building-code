public class WordCounter {

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }


        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "  Hello world! This is a Java program.  ";
        int wordCount = countWords(text);
        System.out.println("Total words: " + wordCount);
    }
}
