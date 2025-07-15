package Java_AlgorithmsRuntime;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000};

        for (int size : sizes) {
            int[] data = new Random().ints(size, 0, size * 2).toArray();

            int[] copy = Arrays.copyOf(data, data.length);
            long start = System.nanoTime();
            bubbleSort(copy);
            long end = System.nanoTime();
            System.out.println("Bubble Sort for size " + size + ": " + (end - start) / 1e6 + " ms");

            copy = Arrays.copyOf(data, data.length);
            start = System.nanoTime();
            Arrays.sort(copy);
            end = System.nanoTime();
            System.out.println("Quick/Merge Sort for size " + size + ": " + (end - start) / 1e6 + " ms");
        }
    }
}
