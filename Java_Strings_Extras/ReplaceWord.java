package Java_Strings_Extras;

public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String target = "Java";
        String replacement = "Python";
        System.out.println("Replaced Sentence: " + replaceWord(sentence, target, replacement));
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll(target, replacement);
    }
}