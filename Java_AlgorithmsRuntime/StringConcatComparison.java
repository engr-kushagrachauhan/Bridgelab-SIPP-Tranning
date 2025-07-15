package Java_AlgorithmsRuntime;

public class StringConcatComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            long start = System.nanoTime();
            String s = "";
            for (int i = 0; i < size; i++) s += "a";
            long end = System.nanoTime();
            System.out.println("String time for " + size + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) sb.append("a");
            end = System.nanoTime();
            System.out.println("StringBuilder time for " + size + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < size; i++) sbuf.append("a");
            end = System.nanoTime();
            System.out.println("StringBuffer time for " + size + ": " + (end - start) / 1e6 + " ms");
        }
    }
}
