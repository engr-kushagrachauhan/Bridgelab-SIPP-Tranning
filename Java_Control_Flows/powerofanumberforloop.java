package Java_Control_Flows;

import java.util.Scanner;

public class powerofanumberforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        sc.close();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
    }
}
