package flowcontrol;

public class Gender {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[1]);
		if(args[0].equals("Female")) {
			if(num>=1&&num<=58) {
				System.out.println("Intrest: 8.2%");
			}
			else if(num>=59&&num<=100){
				System.out.println("Intrest: 9.2%");
			}
		}
		else if(args[0]=="Male") {
			if(num>=1&&num<=58) {
				System.out.println("Intrest: 8.4%");
			}
			else if(num>=59&&num<=100) {
				System.out.println("Intrest: 10.5%");
			}
		}
	}

}
