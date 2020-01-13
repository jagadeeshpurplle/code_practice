package first;

public class SelectionSortPractise {

	public static void main(String args[]) {
		
		SelectionSortPractise obj = new SelectionSortPractise();
		int arr[] = {99,22,1,1,44,12,39};
		obj.Selectionsort(arr);
		obj.printArray(arr);
	}

	 void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
	 
	private void Selectionsort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
					
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	private void bubbleSort(int arr[]) {
		
		
		
		
	}
}

