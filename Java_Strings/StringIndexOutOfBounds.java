package Java_Strings;
import java.util.Scanner;

public class StringIndexOutOfBounds {
    public static void generateException(String input) {
        System.out.println("Generating Exception...");
        char ch = input.charAt(input.length()); // This will throw the exception
        System.out.println("Character at index " + input.length() + ": " + ch);
    }
    public static void handleException(String input) {
        System.out.println("Handling Exception...");
        try {
            char ch = input.charAt(input.length()); // This will throw the exception
            System.out.println("Character at index " + input.length() + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
        scanner.close();
    }
}
