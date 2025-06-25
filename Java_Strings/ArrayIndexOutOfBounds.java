package Java_Strings;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {
    public static void generateException(String[] names) {
        System.out.println("\nGenerating Exception...");
        System.out.println("Accessing index 5: " + names[5]);  // This will throw an exception
    }
    public static void handleException(String[] names) {
        System.out.println("\nHandling Exception...");
        try {
            System.out.println("Accessing index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        handleException(names);
        scanner.close();
    }
}
