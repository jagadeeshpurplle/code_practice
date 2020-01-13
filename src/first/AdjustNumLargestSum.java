package first;

import java.util.ArrayList;

public class AdjustNumLargestSum {

	static int maxSubsetSum(int[] arr) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for (int s = 0; s < arr.length;) {
			h.add(arr[s]);
			s += 2;
		}
		list.add(h);
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			for (int j = i + 2; j < arr.length; j++) {
				ArrayList<Integer> h2 = new ArrayList<Integer>();
				h2.add(n);
				h2.add(arr[j]);
				list.add(h2);
			}
		}
		int max = 0;
		for (ArrayList<Integer> data : list) {
			int sum = 0;
			for (int i : data) {
				sum = sum + i;
			}
			if (max < sum) {
				max = sum;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, -3, 5, 6, 3, 4, 3, 4, 123, 123, 12, 3, 123, 12, 312, 4, 3, 54, 6, 56, 57, 65, 7, 566, 456,
				4,
				54, 6, 54, 64, -56, -46, 45, 6, 46, 34, 2, 5, 435, 34, 53, 45, 34, 5, 46, 4, 6, 45, 6, 456, 4, 6, 546,
				4,
				5, 6, 67, 6, 68, 7, 8, 56, 456, 45, 645 };
		System.out.println(maxSubsetSum(arr));
	}
}
