package Java_LinearAndBinarySearch;
import java.io.*;

public class FileReader_CountWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String target = "word";
        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\s+");
            for (String word : words) {
                if (word.equals(target)) count++;
            }
        }
        reader.close();
        System.out.println("Count: " + count);
    }
}