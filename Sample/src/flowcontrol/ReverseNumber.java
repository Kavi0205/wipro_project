package flowcontrol;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		while(n>0) {
			int a=n%10;
			n=n/10;
			str+=a;
			a++;
		}
		System.out.println(str);
	}

}
