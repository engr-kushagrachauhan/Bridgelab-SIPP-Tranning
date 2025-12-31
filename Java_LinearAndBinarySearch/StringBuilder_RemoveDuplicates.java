package Java_LinearAndBinarySearch;
import java.util.HashSet;

public class StringBuilder_RemoveDuplicates {
    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("banana")); // Output: ban
    }
}