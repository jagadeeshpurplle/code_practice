package hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;

public class MissingNumber {

	public static void FindMissingNumber(int[] array) {
		
		int maxNumber = Arrays.stream(array).max().getAsInt();
		
		int sumOfNaturalNos = (maxNumber * (maxNumber + 1))/2;
		
		int sumOfArray = Arrays.stream(array).sum();
		
		int missingNumber = sumOfNaturalNos - sumOfArray;
		
		System.out.println("Missing No is : "+missingNumber);
	}
	
	public static void FindMissingNumberViaXor(int[] array) {
		
		int xor = 0;
		for(int i:array) {
			xor = xor ^ i;
		}
		
		for(int i=1;i<=array.length+1;i++) {
			xor = xor ^ i;
		}
		
		System.out.println("Missing number is: "+xor);
		
		
	}
	public static void main(String[] args) {
		FindMissingNumberViaXor(new int[] {1,2,3,4,5,7});
	}
}

