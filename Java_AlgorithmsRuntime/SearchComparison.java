package Java_AlgorithmsRuntime;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        int target = -1;

        for (int size : sizes) {
            int[] data = new Random().ints(size, 0, size * 2).toArray();

            long start = System.nanoTime();
            linearSearch(data, target);
            long end = System.nanoTime();
            System.out.println("Linear Search for size " + size + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            binarySearch(data, target);
            end = System.nanoTime();
            System.out.println("Binary Search for size " + size + ": " + (end - start) / 1e6 + " ms");
        }
    }
}
