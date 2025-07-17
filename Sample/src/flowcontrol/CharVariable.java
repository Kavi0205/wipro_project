package flowcontrol;
import java.util.*;
public class CharVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isDigit(ch)) {
			System.out.println("It is a number");
		}
		else if(Character.isLetter(ch)) {
			System.out.println("It is a Alaphabet");
		}
		else {
			System.out.println("It is a special character");
		}
	}

}
