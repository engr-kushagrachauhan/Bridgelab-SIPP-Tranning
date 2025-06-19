package Java_Control_Flows;
import java.util.Scanner;

public class powerofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        sc.close();
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}
	