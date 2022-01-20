package hackerrank;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
//		mergTwoSortedArrays(new int[] {1,3,5,8,10}, new int[] {2,4,9});
		sort(new int[] {1,4,3,2,5,9,8,10});
	}
	
	public static void mergTwoSortedArrays(int[] arr1, int[] arr2) {
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>arr2[0]) {
				swap(arr1, arr2, i, 0);
				sort(arr2);
			}
		}
		
		System.out.println(Arrays.toString(arr1)+""+Arrays.toString(arr2));
		
	}
	
	public static void sort(int[] arr) {
//		Arrays.sort(arr);
		 
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr1, int[] arr2,int i, int j) {
		int temp = arr1[i];
		arr1[i] = arr2[j];
		arr2[j] = temp;
	}
}
