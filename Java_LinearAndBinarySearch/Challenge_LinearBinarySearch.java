package Java_LinearAndBinarySearch;
import java.util.Arrays;

public class Challenge_LinearBinarySearch {
    public static int findMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) if (num > 0 && num <= n) seen[num] = true;
        for (int i = 1; i <= n; i++) if (!seen[i]) return i;
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + findMissingPositive(arr));
        System.out.println("Binary Search index of 3: " + binarySearch(arr, 3));
    }
}