package Java_Control_Flows;
import java.util.Scanner;

public class adduntilzeronentered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0, input;
        sc.close();
        while (true) {
            input = sc.nextDouble();
            if (input == 0.0) break;
            total += input;
        }
        System.out.println("Total: " + total);
    }
}