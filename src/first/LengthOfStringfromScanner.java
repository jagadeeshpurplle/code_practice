package first;

import java.util.Scanner;

public class LengthOfStringfromScanner {

	static String s;
	static int count=0;
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the file name(Note: file name char !>6 && !<6)");
		s=input.nextLine();
		count=s.length();
		System.out.println(s.length());
		 
		if(count==6) {
			
		}else {
			int i=count;
			while(i==6) {
				
				System.out.println("Entered string length is either less/greater than 6, please enter again");
				s=input.nextLine();
				System.out.println(s.length());
					
				count=s.length();
				i=count;
				
			}			
		}

		
		
	}
}
