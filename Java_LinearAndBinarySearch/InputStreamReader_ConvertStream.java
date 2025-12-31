package Java_LinearAndBinarySearch;
import java.io.*;

public class InputStreamReader_ConvertStream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt"), "UTF-8"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}