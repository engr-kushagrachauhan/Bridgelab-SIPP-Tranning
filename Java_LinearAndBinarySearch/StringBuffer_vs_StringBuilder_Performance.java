package Java_LinearAndBinarySearch;
public class StringBuffer_vs_StringBuilder_Performance {
    public static void main(String[] args) {
        int count = 1_000_000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("hello");
        long sbTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) sbf.append("hello");
        long sbfTime = System.nanoTime() - startTime;

        System.out.println("StringBuilder time: " + sbTime / 1_000_000 + " ms");
        System.out.println("StringBuffer time: " + sbfTime / 1_000_000 + " ms");
    }
}