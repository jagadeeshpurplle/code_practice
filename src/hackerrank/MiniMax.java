package hackerrank;

import java.util.Arrays;

public class MiniMax {
	
	public static void miniMax(int[] array) {
		
		Arrays.sort(array);
		
		int min = array[0];
		int max = array[array.length-1];
		
		int sum = Arrays.stream(array).sum();
		
		int minimumSum = sum - max;
		int maxSum = sum-min;
		
		System.out.println("MaxSum: "+maxSum+" MinSum: "+minimumSum);
	}
	
	public static void main(String[] args) {
		miniMax(new int[] {1,2,5,4,3});
	}

}
