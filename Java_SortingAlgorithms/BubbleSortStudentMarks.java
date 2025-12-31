package Java_SortingAlgorithms;
public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {88, 55, 78, 90, 66};
        bubbleSort(marks);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}