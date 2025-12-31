package Java_AlgorithmsRuntime;

public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] ns = {10, 30};

        for (int n : ns) {
            long start = System.nanoTime();
            fibonacciRecursive(n);
            long end = System.nanoTime();
            System.out.println("Recursive for n=" + n + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            fibonacciIterative(n);
            end = System.nanoTime();
            System.out.println("Iterative for n=" + n + ": " + (end - start) / 1e6 + " ms");
        }
    }
}
