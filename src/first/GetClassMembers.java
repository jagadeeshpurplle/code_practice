package first;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetClassMembers {
	
	public static void main(String[] args) {
		
		String s = "DDAaBvvCCCSD";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}		
		}
		System.out.println(map);
	}
	

	public static <T> List<T> test(List<String> bag, T obj)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		if (bag != null) {
			List<T> bags = new ArrayList<T>();
			for (String bagId : bag) {
				Class c = obj.getClass();
				Method m = c.getMethod("setBagId", String.class);
				m.invoke(obj, bagId);
				bags.add(obj);
			}
			return bags;
		}
		return null;
	}
}
