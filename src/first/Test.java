package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {

public static void main(String args[]) {
		
		Scanner inputFromUser = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String input = inputFromUser.nextLine();		

		LinkedHashMap<Character, Integer> done = new LinkedHashMap<Character , Integer>();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character , Integer>();

		
		int count = 0;
	
		char prev =0;
		char pres= 0;
		for(int j=0;j<input.length();j++) {
	
			prev =pres;
			char c = input.charAt(j);
			pres = c;
//			System.out.println(c);
			if(map.containsKey(c)) {
				if(done.containsKey(c)) {
					if(j>=1 && c!=input.charAt(j-1)) {
//						System.out.println("done : "+prev);
						done.put(prev, 1);
					}
					continue;
				}
				map.put(c, map.get(c)+1);	
				
			}else {
				if(j>=1 && c!=input.charAt(j-1)) {
//					System.out.println("done : "+prev);
					done.put(prev, 1);
				}
				map.put(c, 1);
			}
		}
		
		for(char c : map.keySet()) {
			System.out.print(c+""+map.get(c));
		}
		
	}
	
	

	
	
}
