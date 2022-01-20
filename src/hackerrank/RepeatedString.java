 package hackerrank;

public class RepeatedString {

	public static long getRepeatedAInString(String s, long totalLengthNeedToBeFormed) {
		
		int stringLenght = s.length();
		
		long q = totalLengthNeedToBeFormed / stringLenght;
		long remaining = totalLengthNeedToBeFormed % stringLenght;
		long particularStringLength = (remaining == 0) ? 0 : remaining;
		long aOccurences = (q * getACharCount(s,stringLenght)) + getACharCount(s,particularStringLength);
		return aOccurences;
	}
	
	
	private static int getACharCount(String s, long particularStringLength) {
		int count = 0;
		for(int i=0;i<particularStringLength;i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getRepeatedAInString("abca", 5));
	}
}

