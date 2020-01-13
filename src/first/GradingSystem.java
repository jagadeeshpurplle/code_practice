package first;

import java.util.Scanner;

public class GradingSystem {

	
	public static void main(String agrgs[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks of MATHS");
		int maths = input.nextInt()/10;
		
		System.out.println("Enter your marks of PHYSICS");
		int physics = input.nextInt()/10;

		System.out.println("Enter your marks of CHEMISTRY");
		int chemistry = input.nextInt()/10;

		System.out.println("Enter your marks of SOCIAL");
		int social = input.nextInt()/10;

		System.out.println("Enter your marks of ENGLISH");
		int english = input.nextInt()/10;

		System.out.println("Enter your marks of TELUGU");
		int telugu = input.nextInt()/10;

		System.out.println("Enter your marks of HINDI");
		int hindi = input.nextInt()/10;

		int total = maths+physics+chemistry+social+english+telugu+hindi;
		System.out.println("CGPA: "+total/7*9.5);
		
		
		
		
	}
	
	
}
