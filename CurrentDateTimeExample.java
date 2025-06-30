//7

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the date and time
        String formattedDateTime = currentDateTime.format(formatter);

        // Display the result
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
