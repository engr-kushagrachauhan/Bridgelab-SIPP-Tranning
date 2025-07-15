package Java_LinearAndBinarySearch;
import java.io.*;
import java.util.*;

public class Challenge_Compare_All {
    public static void main(String[] args) throws IOException {
        int count = 1_000_000;
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("hello");
        long timeSB = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) sbf.append("hello");
        long timeSBF = System.nanoTime() - start;

        System.out.println("StringBuilder: " + timeSB / 1_000_000 + " ms");
        System.out.println("StringBuffer: " + timeSBF / 1_000_000 + " ms");

        BufferedReader fr = new BufferedReader(new FileReader("largefile.txt"));
        int wordCount = 0;
        String line;
        while ((line = fr.readLine()) != null) {
            wordCount += line.split("\s+").length;
        }
        fr.close();
        System.out.println("Word Count: " + wordCount);
    }
}