package kush;
import java.util.*;
public class p2q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;

        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("Final discounted fee is INR " + finalFee);

        scanner.close();
    }
}
