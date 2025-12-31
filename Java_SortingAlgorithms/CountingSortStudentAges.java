package Java_SortingAlgorithms;
public class CountingSortStudentAges {
    public static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int age : arr) count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 14, 10, 13, 12, 18, 17};
        countingSort(ages, 10, 18);
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}