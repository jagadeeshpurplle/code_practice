package naveenAutomationLabsJavaInterview;

import java.util.Arrays;
import java.util.BitSet;

public class Print1to100WithoutUsingLoopsRecursion {

	public static void main(String[] args) {
		
		
		// array fill
		Object[] array = new Object[100];
		
		Arrays.fill(array, new Object() {
				int count =0;
				
				@Override 
				public String toString() {
					return Integer.toString(++count);
				}
		});
		
		System.out.println(Arrays.toString(array));

		
		//bit set
		
		String numbers = new BitSet() {{set(1,101);}}.toString();
		System.out.append(numbers, 1, numbers.length());
	}
}
