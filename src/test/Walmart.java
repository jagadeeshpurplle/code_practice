package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import first.DivideTheWordsAndFindDup;

public class Walmart {

//	i/p:{"abc","labs","Walmart","xyz","lab","Wal"}, 
//	word: "Walmartlabs"
//	O/p: True
//	Word: PegaLabs
//	O/p:False

	
	public static void main(String[] args) {
	
//		System.out.println(solution(new String[] {"abc","labs","Walmart","xyz","lab","Wal"}, "Walmartlabs"));
//		System.out.println(solution2(new String[] {"abc","labs","Walmart","xyz","lab","Wal"}, "Walmartlabs"));

//		System.out.println(wordBreak("Walmartlabs",new String[] {"abc","labs","Walmart","xyz","lab","Wal"}));
//		System.out.println(checkEquals("Walmartlabs",new String[] {"Wal","abc","labs","Walmart","xyz","lab","Wal"}));
		System.out.println(checkEquals1("Walmartlabs",new String[] {"Wal","abc","labs","Walmart","xyz","lab","Wal"}));

	}
	
	
	public static boolean checkEquals1(String s, String[] dictionary) {
		
		boolean found = true;
		int i=0;
		String word = "";
		while(found && i<s.length()) {
			word += s.charAt(i); //wal
			if(Arrays.asList(dictionary).contains(word)) { // 
				String subString = s.substring(i+1);//martlabs
				if(Arrays.asList(dictionary).contains(subString)) {
					found = false;
					return true;
				}
			}
			i++;
		}
		
		return false;
		
	}
	
	
	public static boolean checkEquals(String s, String[] dictionary) {
		
		for(String word : dictionary) {
			if(s.startsWith(word)) {
				String followingSubString = s.substring(word.length());
				if(s.endsWith(followingSubString)) {
					return true;
				}
//				if((word + followingSubString).equals(s)) {
//					return true;
//				}
			}
		}
		
		return false;
		
	}
	
	public static List<String> wordBreak(String s, String[] dictionary) {

		List<String> results = new ArrayList<>();
		
		if(s.length()==0) {
			results.add(" ");
			return results;
		}
		
		for(String word : dictionary) {
			if(s.startsWith(word)) {
				String followingSubString = s.substring(word.length());
				List<String> subStrings = wordBreak(followingSubString, dictionary);
				for(String eachSubString : subStrings) {
					results.add(word + " "+eachSubString);
				}
			}
		}
		
		return results;
		
	}
	

	public static boolean solution2(String[] array, String expected) {
		
		java.util.Stack<String> data = new java.util.Stack<>();
		long start = System.nanoTime();
		long end = 0;
		for(int i=0;i<array.length;i++) {
			data.push(array[i]);
			for(int j=0;j<array.length;j++) {
				if((array[j]+data.peek()).equals(expected)) {
					end = System.nanoTime();
					System.out.println("elapsed time: "+(end - start)); 
					return true;
				}
				if((data.peek()+array[j]).equals(expected)) {
					end = System.nanoTime();
					System.out.println("elapsed time: "+(end - start)); 
					return true;
				}
			}
			data.pop();
		}
		System.out.println("elapsed time: "+(end - start)); 
		return false;
	}
	
	
	
	
	public static boolean solution(String[] array, String expected) {
		long start = System.nanoTime();
		long end = 0;

		for(int i=0;i<array.length;i++) {
			String word = array[i];
			for(int j=0;j<array.length;j++) {
				if((word+""+array[j]).toLowerCase().equals(expected.toLowerCase())) {
					end = System.nanoTime();
					System.out.println("elapsed time: "+(end - start)); 
					return true;
				}
			}
		}
		System.out.println("elapsed time: "+(end - start));
		return false;
	}
	
}

