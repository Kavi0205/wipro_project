package flowcontrol;
import java.util.*;
public class commandArgs {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			System.out.println(Arrays.toString(args));
		}

	}

}
