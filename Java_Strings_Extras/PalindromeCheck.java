package Java_Strings_Extras;
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is Palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}