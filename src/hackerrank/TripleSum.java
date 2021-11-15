package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripleSum {

	public static int triplets(int a[], int b[], int c[]) {
		int distinctTripletCount = 0;
		int[] distinctA = removeDuplicates(a);
		int[] distinctB = removeDuplicates(b);
		int[] distinctC = removeDuplicates(c);
		
		Arrays.sort(distinctA);
		Arrays.sort(distinctB);
		Arrays.sort(distinctC);
		
		for(int q: distinctB) {
			long c1 = getValidIndex(distinctA, q)+1;
			long c2 = getValidIndex(distinctC, q)+1;
			distinctTripletCount += c1 * c2;
		}
		return distinctTripletCount;
	}
	
	private static int getValidIndex(int[] distinctA, int q) {
		
		int l=0;int h = distinctA.length-1;
		int count = -1;
		while(l<=h) {
			int m = l+(h-l)/2;
			if(distinctA[m] <= q) {
				count = m;
				l = m+1;
			}else {
				h = m-1;
			}
		}
		return count;
	}

	private static int[] removeDuplicates(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int i:a) {
			set.add(i);
		}
		int[] result = new int[set.size()];
		int i =0;
		for(int item : set) {
			result[i] = item;
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {3,5,7,7,1,1};
		int[] b = {7,5,9};
		int[] c = {7,9,11,11,13};
		System.out.println(triplets(a, b, c));
	}
}
