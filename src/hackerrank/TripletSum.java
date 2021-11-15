package hackerrank;

import java.util.HashMap;

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
		}
		
		return results[0] +" "+results[1];
		
	}
	
	 public static void main(String[] args) {
		 System.out.println(getTripletSum(new int[] {1,3,4,1,3}, 5));
	}
}

