package Java_Control_Flows;
import java.util.Scanner;

public class factorialofusergivenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if (number >= 0) {
            int fact = 1;
            while (number > 1) {
                fact *= number;
                number--;
            }
            System.out.println("Factorial: " + fact);
        }
    }
}
