package Java_Control_Flows;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        sc.close();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: " + bmi);
    }
}
