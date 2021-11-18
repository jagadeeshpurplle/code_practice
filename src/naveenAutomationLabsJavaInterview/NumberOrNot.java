package naveenAutomationLabsJavaInterview;

public class NumberOrNot {

	public static void main(String[] args) {
		
	}
	
	public static boolean isCorrectNumber(String number) {
//		return number.matches("\\d{10}");
		
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
	}

}
