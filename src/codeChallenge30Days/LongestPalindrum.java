package codeChallenge30Days;

public class LongestPalindrum {

	public static int resultStart;
	public static int resultLength;

	public static void main(String[] args) {
		System.out.println(getLongestPalindrum("sussfus"));
	}

	public static String getLongestPalindrum(String s) {
		int size = s.length();
		if (size < 2)
			return s;
		for (int start = 0; start < s.length() - 1; start++) {
			getExpandRange(s, start, start); // if string size is odd
			getExpandRange(s, start, start + 1); // if string size is even
		}

		return s.substring(resultStart, resultStart + resultLength);
	}

	private static void getExpandRange(String s, int start, int end) {

		while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}

		if (resultLength < end - start - 1) {
			resultStart = start + 1;
			resultLength = end - start - 1;
		}
	}
	
	public static int resultStart1, resultEnd1;
	
	public static String getLongestPalindrom(String s) {

		if(s.length() < 2) {
			return s;
		}
		
		for(int i=0;i<s.length()-1;i++) {
			expandMyrange(s, i, i);
			expandMyrange(s, i, i+1);
		}
		
		return s.substring(resultStart1, resultStart1+resultEnd1);
	}
	

	private static void expandMyrange(String s, int start, int end) {

		if(start >=0 && end <=s.length()-1 && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		
		if(resultEnd1 < end - start -1) {
			resultEnd1 = end - start -1;
			resultStart1 = start +1;
		}
	}
}
