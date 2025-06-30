//Write a Java program to convert seconds to hour, minute and seconds


public class question19 {
    public static void main(String[] args) {
        int totalSeconds = 3672;  // example input

        int hours = totalSeconds / 3600;         // 1 hour = 3600 seconds
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;             // 1 minute = 60 seconds
        int seconds = remainder % 60;

        System.out.println(totalSeconds + " seconds is equal to:");
        System.out.println(hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
    }
}

