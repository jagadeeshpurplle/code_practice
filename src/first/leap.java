package first;

import java.util.Calendar;
import java.util.Scanner;

public class leap {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
		System.out.println("Enter the year: ");
		int year=input.nextInt();
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int noOfDay=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if(noOfDay>365) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not leap Year");
		}
		}
	}
}
