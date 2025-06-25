package Java_Strings;
import java.util.Scanner;
public class convertstringtouppercase{
    public static String convertToUpperUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String userInput = scanner.nextLine();
        String manualUpper = convertToUpperUsingCharAt(userInput);
        String builtInUpper = userInput.toUpperCase();
        boolean isSame = compareUsingCharAt(manualUpper, builtInUpper);
        System.out.println("\nManual Conversion : " + manualUpper);
        System.out.println("Built-in Conversion: " + builtInUpper);
        System.out.println("Are both conversions equal? " + isSame);
        scanner.close();
    }
}
