package naveenAutomationLabsJavaInterview;

public class PassingNullWithMethodOverloadingObjectAndString {

	
	public static void main(String[] args) {
		
		test(null);
		// compiler is smart enough that it checks for most obvious and common data type, string 
		//is child of Object class, but compiler will take decision with string over the object here
		
	}

	public static void test(Object s) {
		System.out.println("Object method");
	}
	
	public static void test(String s) {
		System.out.println("String method");
	}
}
