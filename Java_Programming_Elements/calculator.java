package Java_Programming_Elements;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float num1 = sc.nextFloat(); 
        float num2 = sc.nextFloat(); 
        Float sum = num1 + num2; 
        Float difference = num1 - num2; 
        Float product = num1 * num2; 
        Float quotient = num1 / num2; 
        System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+sum+", "+difference+", "+product+", and "+quotient);
        sc.close();
    }
}