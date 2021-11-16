package naveenAutomationLabsJavaInterview;

public class BinaryNumberOrNot {

	public static void main(String[] args) {
		
		isBinaryRegExp(1011011);
		
	}
	
	public static void isBinaryRegExp(int number) {
		if(String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number +" is a binary number");
		}else
			System.out.println(number +" is not a binary number");
	}
	
	public static void checkBinaryOrNot(int number) {
		
		boolean isBinary = true;
		int copy = number;
		while(number > 0) {
			
			int lastDigit = number % 10;
			
			if(lastDigit > 1) {
				isBinary = false;
				break;
			}
			number = number /10;
			
		}
		
		if(isBinary) {
			System.out.println(copy +" is a binary number");
		}else
			System.out.println(copy +" is not a binary number");
	}
	
}
