package Java_Arrays;
import java.util.Scanner;
public class enteringvaluesinarrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full (10 values reached).");
                break;
            }
            numbers[index] = input;
            index++;
        }
        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total sum = " + total);
        scanner.close();
    }
}
