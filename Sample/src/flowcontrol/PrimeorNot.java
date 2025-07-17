package flowcontrol;
import java.util.*;
public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
			System.out.println("This is not a prime number");
		}
		else {
			System.out.println("This is a prime number");
		}

	}

}
