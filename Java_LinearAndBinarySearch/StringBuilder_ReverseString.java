package Java_LinearAndBinarySearch;
public class StringBuilder_ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}