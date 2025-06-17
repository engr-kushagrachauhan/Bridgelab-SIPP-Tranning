package Java_Programming_Elements;
import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        temp =a;
        a =b;
        b  =temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
}
