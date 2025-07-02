package Java_Strings_Extras;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed: " + reverse(input));
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}