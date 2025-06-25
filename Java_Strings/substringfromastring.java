package Java_Strings;
import java.util.Scanner;
public class substringfromastring {
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            result.append(str.charAt(i));
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
        System.out.print("Enter the main string: ");
        String input = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        String manualSubstring = createSubstringUsingCharAt(input, start, end);
        String builtInSubstring = "";
        if (start >= 0 && end <= input.length() && start < end) {
            builtInSubstring = input.substring(start, end);
        } else {
            System.out.println("Invalid range for built-in substring, skipping built-in method.");
        }
        System.out.println("\nManual Substring    : " + manualSubstring);
        System.out.println("Built-in Substring  : " + builtInSubstring);
        boolean isSame = compareUsingCharAt(manualSubstring, builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);
        scanner.close();
    }
}
