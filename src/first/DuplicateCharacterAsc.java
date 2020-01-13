package first;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateCharacterAsc {

	
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
	  
		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int max_idx = i; 
//			System.out.println(arr[min_idx]);
			for (int j = i+1; j < n; j++) {
//				System.out.println(arr[j]);
				if (arr[j] > arr[max_idx]) 
					max_idx = j; 
//					System.out.println("minimum : " + arr[min_idx]);
			}
			// Swap the found minimum element with the first 
			// element 
			int temp = arr[max_idx]; 
			arr[max_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	}
	
	
	void sort2(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int max_index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[max_index]) {
					max_index = j;
				}
			}

			int temp = arr[max_index];
			arr[max_index] = arr[i];
			arr[i] = temp;
			
		}
		
		
	}
	
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ //
		DuplicateCharacterAsc ob = new DuplicateCharacterAsc(); 
		int arr[] = {3,5,5,5,8,7,3,3,3,8,1,1}; 
		ob.sort2(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
//		System.exit(0);
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		int maxValue = 0;
		int maxKey = 0;
		int size = map.size();
		String result = ""; 
		for(int j=0;j<size;j++) {
			for(int in : map.keySet()) {
				if(map.get(in)>maxValue) {
					maxKey = in;
					maxValue = map.get(in);
				}
//				System.out.println(max);
//				System.out.println(in +" : "+map.get(in));
			}	
			
//			System.out.println(maxKey+":"+map.get(maxKey)); 
			result = result + maxKey+":"+map.get(maxKey)+"\n";
			map.remove(maxKey,map.get(maxKey));
			maxKey = 0;
			maxValue =0;
//			map.remove(maxKey);
		}
		
		System.out.print(result);

		
		
	} 
	
}
