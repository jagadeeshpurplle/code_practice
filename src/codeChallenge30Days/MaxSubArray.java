package codeChallenge30Days;

public class MaxSubArray {

	public static void main(String[] args) {

		System.out.println(getMaxSubArray(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1 }));

	}

	public static int getMaxSubArray(int[] array) {
		int ans = Integer.MIN_VALUE, a = 0;
		for (int n : array) {
			a += n;
			ans = Math.max(ans, a);
			a = Math.max(a, 0);
		}
		return ans;
	}
}
