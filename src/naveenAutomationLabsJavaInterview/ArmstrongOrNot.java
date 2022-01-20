package naveenAutomationLabsJavaInterview;

public class ArmstrongOrNot {
	
	public static void main(String[] args) {
//		System.out.println(armstrongNumber(9));
//		System.out.println(armstrongNumber(123));
//		System.out.println(armstrongNumber(153));
		for(int i=100;i<999;i++) {
			if(armstrongNumber(i))
				System.out.println(true);
		}
	}

	public static boolean armstrongNumber(int number) {
		
		if(number < 0 || number <=9)
			return false;
		
		int power = power(number);
		int sum = 0;
		int copyNumber = number;
		
		while(copyNumber !=0) {
			int reminder = copyNumber%10;
			int factor = 1;
			for(int i=0;i<power;i++) {
				factor = factor * reminder;
			}
			sum = sum + factor;
			copyNumber = copyNumber /10;
		}
		
		if(sum == number) {
			return true;
		}
		
		return false;
		
	}
	
	public static int power(int number) {
		int power = 0;
		while(number!=0) {
			power++;
			number = number/10;
		}
		return power;
	}
}
