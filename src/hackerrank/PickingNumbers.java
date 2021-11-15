package hackerrank;

import java.util.LinkedList;
import java.util.List;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> arr) {
		
		int[] frequency = new int[101];
		int results=  Integer.MIN_VALUE;
		for(int i=0;i<arr.size();i++) {
			int index = arr.get(i);
			frequency[index]++;
		}
		
		for(int i=1;i<=100;i++) {
			results = Math.max(results, frequency[i] + frequency[i-1]);
		}
		return results;
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(2);
		System.out.println(pickingNumbers(list));
	}
}
