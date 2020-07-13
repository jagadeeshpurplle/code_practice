package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Rep {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(4);
		s.add(1);
		s.add(4);
		s.add(5);

		System.out.println(getRep(s));

	}

	public static HashMap<Integer, Integer> getRep(List<Integer> l) {

		HashMap<Integer, Integer> data = new LinkedHashMap<Integer, Integer>();
		for (Integer i : l) {
			if (data.containsKey(i)) {
				data.put(i, data.get(i) + 1);

			} else {
				data.put(i, 1);
			}
		}
		return data;

	}

}
