package Java_LinearAndBinarySearch;
import java.io.*;

public class InputStreamReader_ReadUserInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String input;
        while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
            writer.write(input);
            writer.newLine();
        }

        writer.close();
    }
}