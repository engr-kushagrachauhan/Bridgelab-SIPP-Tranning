package Java_Control_Flows;
import java.util.*;
public class findevenoddbetween1andn{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+"even");
				
			}
			else {
				System.out.println(i+"odd");
			}
		}
	}
}