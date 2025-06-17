package Java_Programming_Elements;
import java.util.Scanner;
public class TemperatureConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double fahrenheit = sc.nextDouble();
        Double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("the "+fahrenheit+"fahrenheit is equal to "+celsius+" celsius");
        sc.close();
    }
}
