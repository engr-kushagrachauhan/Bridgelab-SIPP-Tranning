package Java_Strings_Extras;
public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "hellohellohello";
        String sub = "hello";
        System.out.println("Occurrences: " + countOccurrences(str, sub));
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}