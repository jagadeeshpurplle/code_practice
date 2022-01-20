package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
	
	public static void generateString() {
		String s = "Idea,Idea In-Progress,In-Progress,Pending Review,Pending Merge,Pending Documentation,Internal Adoption,Resolved-Completed,Resolved-Completed0,Resolved-Completed1";
		int n = 42;
		String s1 = "";
		for(int i=2;i<n;i++) {	
			s1 += "Resolved-Completed"+i;
			if(i!=n-1)
				s1+=",";
		}
		System.out.println(s+","+s1);
		System.out.println(s1.split(",").length + s.split(",").length);
	}
	
	
	public static void main(String[] args) {
	
		generateString();
//		String s = "{[a[bc]d]e}}";
//
//		System.out.println(rightFormat(s));
//		System.out.println(palindrom("aabbaaa"));
	}
	
	public static boolean rightFormat(String s) {
		Stack<Character> data = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch))
				continue;
			if(ch == '[' || ch == '{' || ch == '(') {
				data.push(ch);
			}else {
				if(data.isEmpty()) {
					return false;
				}
				char peek = data.peek();
				if((ch == ']' && peek == '[') || (ch == '}' && peek == '{') || (ch == ')' && peek == '(')) {
					data.pop();
				}
			}
		}
		
		return true;
	}
	
	
	public static boolean palindrom(String s) {
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		
		return true;
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
