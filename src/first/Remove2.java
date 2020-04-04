
package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Remove2 {

	public static void main(String[] args) {
		Map<String, String> correctMap = new HashMap<String, String>();
		correctMap.put("Karnatak", "banglore");
		correctMap.put("Maharastra", "Mumbai");

		List<Map<String, String>> listOfMaps = new ArrayList<Map<String, String>>();
		Map<String, String> anotherMap = new HashMap<String, String>();
		anotherMap.put("Karnatak", "sdfsdf");
		anotherMap.put("name", "sdfsd");
		anotherMap.put("Maharastra", "sdfsd");

		Map<String, String> anotherMap2 = new HashMap<String, String>();
		anotherMap2.put("name", "sdfsdf");
		anotherMap2.put("Maharastra", "sdfsd");

		listOfMaps.add(anotherMap);
		listOfMaps.add(anotherMap2);
		System.out.println(remove(correctMap, listOfMaps));
	}

	public static List<Map<String, String>> remove(Map<String, String> correctMap, List<Map<String, String>> listNew) {

		List<Map<String, String>> listNewToReturn = new ArrayList<Map<String, String>>();

		for (Map<String, String> map : listNew) {
			Map<String, String> newMapper = new HashMap<String, String>();
			for (String s : map.keySet()) {
				String value = map.get(s);
				int l = 0;
				for (Entry<String, String> entryCorrectMap : correctMap.entrySet()) {
					l++;
					String keyCorrectMap = entryCorrectMap.getKey();

					if (keyCorrectMap.equals(s)) {
						newMapper.put(correctMap.get(keyCorrectMap), value);
						break;

					} else if (l == correctMap.size()) {
						newMapper.put(s, value);
						break;
					}

				}
			}
			listNewToReturn.add(newMapper);
		}
		return listNewToReturn;
	}
}
