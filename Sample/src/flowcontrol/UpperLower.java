package flowcontrol;
import java.util.*;
public class UpperLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(Character.isLowerCase(ch)) {
			char res=(char)(ch-32);
			System.out.println(res);
		}
		else if(Character.isUpperCase(ch)){
			char res=(char)(ch+32);
			System.out.println(res);
		}
		

	}

}
