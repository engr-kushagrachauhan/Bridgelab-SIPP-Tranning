package Java_Programming_Elements;
import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); 
        int totalhankshakes = (n*(n-1))/2;
        System.out.println("Total number of handshakes is " + totalhankshakes);
        sc.close();
    }
}
