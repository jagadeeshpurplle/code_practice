package naveenAutomationLabsJavaInterview;

public class ReplaceUnknownCharsFromString {

	public static void main(String[] args) {
		
		removeUnknownChars("jagadeeshgmail.com$&*");
		
	}
	
	public static void removeUnknownChars(String s) {
		String regex = "[^a-zA-z0-9]";
		s =  s.replaceAll(regex, "");
		System.out.println(s);
	}
}
