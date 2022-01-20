package codeChallenge30Days;

public class MaxSubArray {

	public static void main(String[] args) {

		System.out.println(getMaxSubArray(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1 ,6,1,7}));
		System.out.println(maxSubArray(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1, 6 ,1,7}));
		System.out.println(maxSubArrayValue(new int[] { 1, 4, -5, 1, -4, 6, -2, -5, -1, 6 ,1,7}));

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
	
	public static int maxSubArray(int[] arr) {
		int sum = 0; int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum > max) {
				max = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		return max;
	}
	
	public static int maxSubArrayValue(int[] arr) {
		
		int max = arr[0];
		int currentSum = max;
		
		for(int i=0;i<arr.length;i++) {

			currentSum = Math.max(arr[i] + currentSum, arr[i]);
			max = Math.max(currentSum, max);
			
		}			
		return max;	
	}

}
