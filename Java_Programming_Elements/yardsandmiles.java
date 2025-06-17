package Java_Programming_Elements;
import java.util.Scanner;

public class yardsandmiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feets = sc.nextDouble();
        double yards = feets / 3;
        double miles = yards /1760;
        System.out.println(feets + " feet is equal to " + yards + " yards and " + miles + " miles."); 
        sc.close();
    }
}