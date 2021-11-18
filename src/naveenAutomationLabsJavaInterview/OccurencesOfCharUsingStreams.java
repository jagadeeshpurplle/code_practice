package naveenAutomationLabsJavaInterview;

public class OccurencesOfCharUsingStreams {

	public static void main(String[] args) {
	
		String str = "jagadeesh";
		
		long aCount = str.chars().filter(e -> (char)e == 'a').count();
		
		System.out.println(aCount);
	}

	
}
