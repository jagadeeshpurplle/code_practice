package hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecondHighestFreqChar {

	public static void getSeconHighChar(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(map);
		
		
		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
		
		for(Map.Entry<Character, Integer> entry : list) {
			temp.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(temp);
	}

	 static final int NOOFCHARS = 256;
	 static char get2ndMostFreq(String str1) {

	  int[] ctr = new int[NOOFCHARS];
	  int i;
	  for (i = 0; i < str1.length(); i++)
	   (ctr[str1.charAt(i)]) ++;

	  int ctr_first = 0, ctr_second = 0;
	  for (i = 0; i < NOOFCHARS; i++) {
	   if (ctr[i] > ctr[ctr_first]) {
	    ctr_second = ctr_first;
	    ctr_first = i;
	   } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
	    ctr_second = i;
	  }
	  return (char) ctr_second;
	 }
	
	
	public static void main(String[] args) {
		System.out.println(get2ndMostFreq("aaabbbbccbca"));
	}
}
