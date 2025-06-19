package Java_Control_Flows;
import java.util.*;
public class sumofnnaturalnumbers{
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt();
		int loop=0;
		int formula=n*(n+1)/2;
		for(int i=1;i<=n;i++) {
			loop+=i;
		}
		if(loop==formula) {
			System.out.println("both computations was correct");
		}
		else {
			System.out.println("both computations differ");
		}
		sc.close();
		
	}
}