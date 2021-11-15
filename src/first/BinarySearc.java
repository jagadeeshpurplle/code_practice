package first;

public class BinarySearc { 
	// Returns index of x if it is present in arr[], 
	// else return -1 
	int binarySearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		System.out.println(r);
		while (l <= r) { 
			int m = l + (r - l) / 2; 
			System.out.println(m);

			// Check if x is present at mid 
			if (arr[m] == x) 
				return m; 

			// If x greater, ignore left half 
			if (arr[m] < x) {
				l = m + 1; 
				System.out.println(l);
			}
			// If x is smaller, ignore right half 
			else {
				r = m - 1; 
				System.out.println(r);
			}
		} 

		// if we reach here, then element was 
		// not present 
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearc ob = new BinarySearc(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
	
	public int s(int[] u, int x) {
		
		int l=0, r=u.length-1;
		
		while(l<=r) {
			int m = (l+r)/2;
			
			if(u[m] == x) {
				return m;
			}
			
			if(u[m] > x) {
				r = m -1;
			}
			else {
				l = m +1;
			}
		}
		
		return -1;
	}
} 
