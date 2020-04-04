package first;

import java.util.HashSet;

public class FindSumOfTwoNumberThatEqualsANumber {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 2, 4, 1, 10, 3, 3, 4, 5, 5 };
		printPairUsingSet(numbers, 5);
	}

	public static void getNumbers(int[] array, int sum) {

		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			System.out.println(array[low] + " + " + array[high]);
			if (array[low] + array[high] == sum) {
				System.out.println("sum of " + array[low] + " + " + array[high] + " - " + sum);

			}
			if (array[low] + array[high] > sum) {
				high--;
			} else {
				low++;
			}
		}
	}

	public static void printPairUsingSet(int[] array, int sum) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			int target = sum - array[i];

			if (set.contains(target)) {
				System.out.println("pair found of sum " + sum + " with " + array[i] + " + " + target);
			}

			set.add(array[i]);
		}
	}

}
