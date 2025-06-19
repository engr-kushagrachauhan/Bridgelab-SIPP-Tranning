package Java_Control_Flows;
import java.util.Scanner;

public class employeebonuscalcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        sc.close();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}
