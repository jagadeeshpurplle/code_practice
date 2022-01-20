package hackerrank;

import java.util.Set;
import java.util.TreeSet;

public class GainSight {

	static int resultLength, startPoint;

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add(1);
		set.add("2");
		set.add(3);
		System.out.println(set);
//		System.out.println(getLongestPalindrom("pamalayalamaya"));
	}
	
	public static String getLongestPalindrom(String s){
		for(int i=0;i<s.length()-1;i++){ 
			expandMyString(s,i,i);
			expandMyString(s,i,i+1);
		}
		return s.substring(startPoint,resultLength+startPoint);
	}

	public static void expandMyString(String s, int start, int end){
		
		while(start >=0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
			start--;
			end++;
		}
		
		if( resultLength < end-start-1){
			resultLength = end -start-1;
			startPoint = start+1;
		}
	}

	
}
