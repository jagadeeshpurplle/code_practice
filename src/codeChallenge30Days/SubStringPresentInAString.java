package codeChallenge30Days;

public class SubStringPresentInAString {

	public static void main(String[] args) {
		
		System.out.println(checkSubString("jagadeesh is", "deesh2"));
	}
	
	public static String checkSubString(String str, String subString) {
		
		if(str.matches(".*"+subString+".*")) {
			return "found";
		}else
			return "Not Found";
		
	}
}
