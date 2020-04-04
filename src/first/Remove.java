package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Remove {

	public static void main(String[] args) {
		remove();
	}

	public static void remove() {
		Map<String, String> correctMap = new HashMap<String, String>();
		correctMap.put("Karnatak", "banglore");
		correctMap.put("Maharastra", "Mumbai");

		List<Map<String, String>> listNew = new ArrayList<Map<String, String>>();
		Map<String, String> anotherMap = new HashMap<String, String>();
		anotherMap.put("Karnatak", "sdfsdf");
		anotherMap.put("name", "sdfsd");
		anotherMap.put("Maharastra", "sdfsd");

		Map<String, String> anotherMap2 = new HashMap<String, String>();
		anotherMap2.put("name", "sdfsdf");
		anotherMap2.put("Maharastra", "sdfsd");

		listNew.add(anotherMap);
		listNew.add(anotherMap2);
		for (int i = 0; i < listNew.size(); i++) {
			Map<String, String> mapper = listNew.get(i);
			Iterator<Entry<String, String>> eachIterator = mapper.entrySet().iterator();

			while (eachIterator.hasNext()) {
				Map.Entry<String, String> entry = eachIterator.next();
				String key = entry.getKey();
				String value = entry.getValue();

				for (Entry<String, String> entryCorrectMap : correctMap.entrySet()) {
					String keyCorrectMap = entryCorrectMap.getKey();

					if (keyCorrectMap.equals(key)) {
						mapper.put(correctMap.get(keyCorrectMap), value);
//						mapper.remove(key, mapper.get(key));
						break;

					}

				}
				eachIterator.remove();
			}
		}

//		for (Map<String, String> mapper : listNew) {
//			Iterator<Entry<String, String>> eachIterator = mapper.entrySet().iterator();
//			while (eachIterator.hasNext()) {
//				Map.Entry<String, String> entry = eachIterator.next();
//				String key = entry.getKey();
//				String value = entry.getValue();
//
//				for (Entry<String, String> entryCorrectMap : correctMap.entrySet()) {
//					String keyCorrectMap = entryCorrectMap.getKey();
//
//					if (keyCorrectMap.equals(key)) {
////						mapper.remove(key, mapper.get(key));
//						eachIterator.remove();
//						break;
//
//					}
//
//				}
//
//			}
//
//		}
	}
}
