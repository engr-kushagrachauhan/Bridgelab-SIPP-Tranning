package Java_LinearAndBinarySearch;
public class StringBuffer_ConcatenateStrings {
    public static String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "World", "!"};
        System.out.println(concatenate(arr)); // Output: Hello World!
    }
}