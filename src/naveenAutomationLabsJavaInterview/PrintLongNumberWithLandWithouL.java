package naveenAutomationLabsJavaInterview;

public class PrintLongNumberWithLandWithouL {

	public static void main(String[] args) {
		
		long longNumberWithouL= 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;
		
		System.out.println(longNumberWithL);
		System.out.println(longNumberWithouL);
	}
}
