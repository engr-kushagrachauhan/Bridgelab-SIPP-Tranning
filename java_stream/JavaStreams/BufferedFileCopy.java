package JavaStreams;
import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        long start, end;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_buffered.txt"))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            start = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}