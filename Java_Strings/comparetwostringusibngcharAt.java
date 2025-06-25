package Java_Strings;
import java.util.Scanner;
public class comparetwostringusibngcharAt {
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are different, strings can't be equal
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
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean manualComparison = compareUsingCharAt(str1, str2);
        boolean builtInComparison = str1.equals(str2);
        System.out.println("\nComparison using charAt(): " + manualComparison);
        System.out.println("Comparison using equals(): " + builtInComparison);
        if (manualComparison == builtInComparison) {
            System.out.println("Both comparison methods gave the SAME result.");
        } else {
            System.out.println("Comparison methods gave DIFFERENT results.");
        }
        scanner.close();
    }
}
