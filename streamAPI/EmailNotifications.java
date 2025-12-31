package streamAPI;
import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("user1@example.com", "user2@example.com");

        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Sending email notification to: " + email);
    }
}
