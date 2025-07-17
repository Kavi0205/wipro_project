package flowcontrol;
import java.util.*;
public class samelastdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int a1=a%10;
		int b1=b%10;
		if(a1==b1) {
			System.out.println("true");
		}
	}

}
