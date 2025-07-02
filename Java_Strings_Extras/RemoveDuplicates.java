package Java_Strings_Extras;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Without duplicates: " + removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}