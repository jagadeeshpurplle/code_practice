package naveenAutomationLabsJavaInterview;

public class CompareTwoIntegesCaching {

	public static void main(String[] args) {
		
		
		// Integer values ranges from -128 to 127, so whenver you compare two integers within this range, 
		// then == will give true
		
		Integer num1 = -128;
		Integer num2= -128;
		
		if(num1 == num2) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
	}
}