package Java_LinearAndBinarySearch;
public class LinearSearch_FindWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {"hello world", "welcome to java", "search this word"};
        System.out.println(findSentenceWithWord(sentences, "java")); // Output: welcome to java
    }
}