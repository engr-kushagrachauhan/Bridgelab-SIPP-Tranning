package Java_Strings_Extras;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        System.out.println("Modified String: " + removeChar(input, toRemove));
    }

    public static String removeChar(String str, char ch) {
        return str.replaceAll(Character.toString(ch), "");
    }
}