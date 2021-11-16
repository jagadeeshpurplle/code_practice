package naveenAutomationLabsJavaInterview;

public class ReverseNumberRecursion {

	public static void main(String[] args) {
		
		reverseNumber(1234);
		System.out.println(reverse);
	}
	
	static String reverse = "";
	public static void reverseNumber(long number) {
		
		if(number < 10) {
			reverse = reverse +""+ number;
		}else {
			reverse = reverse + number %10;
			reverseNumber(number/10);
		}
		
	}
}
