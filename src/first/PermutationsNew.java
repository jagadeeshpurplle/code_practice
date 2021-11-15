package first;

public class PermutationsNew {

	public static void main(String[] args) {
		
		int[] a= new int[] {1,2,3};
		printPermutations(a, 0);
	}
	
	public static void printPermutations(int[] a, int cindx) {
		if(cindx == a.length-1) {
			for(int value:a) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		for(int i=cindx;i<a.length;i++) {
			swap(a, i, cindx);
			printPermutations(a, cindx+1);
			swap(a, i, cindx);
		}
	}

	private static void swap(int[] a, int i, int cindx) {
		int temp = a[i];
		a[i] = a[cindx];
		a[cindx] = temp;
		
	}
}
