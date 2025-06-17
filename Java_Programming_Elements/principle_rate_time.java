package Java_Programming_Elements;
import java.util.Scanner;

public class principle_rate_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double principle = sc.nextDouble();
        Double rate = sc.nextDouble();
        Double time = sc.nextDouble();
        Double simpleInterest = (principle * rate * time) / 100; // Calculate simple interest
        System.out.println("The simple interest is " + simpleInterest + " for principle " + principle + ", rate " + rate + ", and time " + time);
        sc.close();
    }
}
