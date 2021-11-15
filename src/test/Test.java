package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	public static void main(String[] args) {
	
		
		String s = "{[a[bc]d]e}";

		
		
	}
	
	
	public static boolean rightFormatString(String s) {
		
		Map<Character, Character> chars = new HashMap<Character, Character>();
		chars.put('[', ']');
		chars.put('{', '}');
		chars.put('<', '>');
		chars.put('(', ')');
		
		char[] data = new char[s.length()];
		
		char[] opening = {'[','<','{','(',};
		char[] closing = {']','>','}',')',};
		
		for(int i=0;i<s.length();i++) {
			
			if(Arrays.asList(opening).contains(s.charAt(i))) {
			
			}
		}
		
		return false;
		
		
	}
	

}
