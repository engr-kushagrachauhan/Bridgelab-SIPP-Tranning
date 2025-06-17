package Java_Programming_Elements;
import java.util.Scanner;

public class dividechocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int totalChocolates = sc.nextInt(); 
        int children = sc.nextInt(); 
        int chocolatesPerChild = totalChocolates / children; 
        int remainingChocolates = totalChocolates % children; 
        System.out.println("The Chocolates Per Child is "+ chocolatesPerChild+" and the remaining chocolates not distributed is " + remainingChocolates);
        sc.close();
    }
}
