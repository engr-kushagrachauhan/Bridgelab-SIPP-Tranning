package Java_Control_Flows;
import java.util.Scanner;

public class firstsmall {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        sc.close();
        System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
    }
}
