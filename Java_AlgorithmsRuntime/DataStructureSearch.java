package Java_AlgorithmsRuntime;

import java.util.*;

public class DataStructureSearch {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        int target = -1;

        for (int size : sizes) {
            int[] arr = new Random().ints(size, 0, size * 2).toArray();
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int num : arr) {
                hashSet.add(num);
                treeSet.add(num);
            }

            long start = System.nanoTime();
            for (int num : arr) if (num == target) break;
            long end = System.nanoTime();
            System.out.println("Array search for size " + size + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet search for size " + size + ": " + (end - start) / 1e6 + " ms");

            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet search for size " + size + ": " + (end - start) / 1e6 + " ms");
        }
    }
}
