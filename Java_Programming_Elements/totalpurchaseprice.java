package Java_Programming_Elements;
import java.util.Scanner;

public class totalpurchaseprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double unitprice =sc.nextDouble();
        Double quantity = sc.nextDouble();
        Double total = unitprice * quantity; // Calculate total prize
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and the unit price is INR " + unitprice);
        sc.close();
    }
}
