package first;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOfChar {

	public static void main(String[] args) {

		System.out.println(getCount("dfjkdsmmfddfmdfmdfmm"));

	}

	public static int getCount(String s) {
		HashMap<Character, Integer> count = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (count.containsKey(s.charAt(i))) {
				count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
			} else {
				count.put(s.charAt(i), 1);
			}
		}

		for (Character c : count.keySet()) {
			if (c == 'm') {
				return count.get(c);
			}
		}
		return 0;
	}

}
