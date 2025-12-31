package Java_LinearAndBinarySearch;
public class LinearSearch_FirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 0, -1, 3};
        System.out.println(findFirstNegative(arr)); // Output: 3
    }
}