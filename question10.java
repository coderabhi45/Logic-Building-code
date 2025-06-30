//Write a Java program to check whether Java is installed on your computer or not

public class question10 {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Java is installed.");
        System.out.println("Java version: " + version);
    }
}
