package flowcontrol;
import java.util.*;
public class Alphabetical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		char ch1=sc.next().charAt(0);
		if(ch1>ch) {
			System.out.println(ch+","+ch1);			
		}
		else {
			System.out.println(ch1+","+ch);
		}
	}

}
