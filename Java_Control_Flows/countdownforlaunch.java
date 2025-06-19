package Java_Control_Flows;
import java.util.Scanner;
public class countdownforlaunch{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		for(int i=a;i>=1;i--) {
			System.out.println(i);
		}
	}
}
