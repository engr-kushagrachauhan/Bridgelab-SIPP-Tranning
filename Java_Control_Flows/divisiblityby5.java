package Java_Control_Flows;
import java.util.Scanner;

public class divisiblityby5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        sc.close();
        }
}
