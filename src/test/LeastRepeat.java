package test;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LeastRepeat {

	
	public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String s = "abcdabcdabjcdacd";
        char[] chars = s.toCharArray();

        for (Character ch: chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for(char ch : keys) {
        	System.out.println(ch + " : "+map.get(ch));
        }
        
        
        System.out.println(map.entrySet().stream().min( Comparator.comparingInt( Map.Entry::getValue) ).get().getKey());
/*        
        Set<Character> keys = map.keySet();
        
        int min = 1, min2 = 0;
        char ch2 = 0;
        for(char ch : keys) {
        	min2 = map.get(ch);
        	System.out.println(ch + " ,"+ map.get(ch));
        	if(min2==min) {
        		System.out.println(ch + " has minimum occurences i.e : "+ map.get(ch));
        		break;
        	}else if(min2>min){
        		min = min2;
        		ch2= ch;
        	}
        }
        System.out.println(ch2 + " has minimum occurences i.e : "+ map.get(ch2));*/
        
	}
	public Character returnMin(HashMap<Character, Integer> map) {
		
		return map.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
		
	}
	
}

