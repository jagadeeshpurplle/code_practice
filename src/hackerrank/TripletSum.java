package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripletSum {

	public static String getTripletSum(int[] arr, int m) {
		
		int[] results = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int x = arr[i];
			int y = m - x;
			Integer result= map.get(y);
			if(result != null) {
				results[0] = result +1;
				results[1] = i+1;
				break;
			}
			map.put(x, i);
			System.out.println(map);
		}
		
		return results[0] +" "+results[1];
		
	}
	
	 public static void main(String[] args) {
		 System.out.println(findTriplet(new int[] {1,3,4,1,3}, 5));
	}
	 
	 public static String findTriplet(int[] array, int number) {
		 boolean found = false;
		 int value1 = 0, value2 = 0;
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0;i<array.length;i++) {
			 
			 int x = number - array[i];
			 if(list.contains(x)) {
				 value1 = array[i];
				 value2 = x;
				 found = true;
				 break;
			 }
			 list.add(array[i]);
		 }
		 
		 
		 if(found)
			 return value1 +" " +value2;
		 else
			 return "No triplets found";
	 }
	 
	 
}

