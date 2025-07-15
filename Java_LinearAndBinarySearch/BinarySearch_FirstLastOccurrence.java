package Java_LinearAndBinarySearch;
public class BinarySearch_FirstLastOccurrence {
    public static int[] findFirstLast(int[] arr, int target) {
        int[] result = {-1, -1};
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) left = mid + 1;
            else {
                if (arr[mid] == target) result[0] = mid;
                right = mid - 1;
            }
        }

        left = 0; right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) right = mid - 1;
            else {
                if (arr[mid] == target) result[1] = mid;
                left = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int[] res = findFirstLast(arr, 2);
        System.out.println(res[0] + " " + res[1]); // Output: 1 3
    }
}