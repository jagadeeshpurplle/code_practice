package first;

import java.util.Arrays;
import java.util.List;

public class SecondLargestInArray {

	List<Integer> secondLar(int[] arr) {
		
		int largest = arr[0];
		int secondLargest = arr[0];
		int thirdLargest = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i]>secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
				
			}else if (arr[i]>thirdLargest) {
				thirdLargest = arr[i];
			}
			
		}
		
		return Arrays.asList(largest,secondLargest, thirdLargest);
	}
	
	public static void main(String args[]) {
		
		int[] arr = {12,32,21,14,34,33,23,55};
		SecondLargestInArray sla = new SecondLargestInArray();
		System.out.println(sla.secondLar(arr));
		
		
	}
	
	
}
