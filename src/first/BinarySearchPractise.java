package first;

import java.util.Arrays;

public class BinarySearchPractise {

	int binary(int[] arr, int x) {

		int size = arr.length - 1, l = 0;

		while (l <= size) {
			int m = (l + size) / 2;
			System.out.println(arr[m]);

			if (x == arr[m]) {
				return m;
			}

			if (x > arr[m]) {
				l = m + 1;
			} else {
				size = m - 1;
			}
		}

		System.out.println("Not matched");
		return -1;

	}

	public static void main(String args[]) {

		BinarySearchPractise bsp = new BinarySearchPractise();

		int arr[] = { 33, 12, 4, 1, 43, 23, 5 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int x = 5;
		int result = bsp.binarySearch(arr, x);
		if (result == -1) {
			System.out.println("Not Found ");
		} else {
			System.out.println("Found at " + result + " : " + arr[result]);
		}

	}

	public int binarySearch(int[] arr, int x) {

		int size = arr.length - 1, l = 0;

		while (l <= size) {

			int m = (l + size) / 2;
			if (arr[m] == x)
				return m;

			if (x > arr[m])
				l = m + 1;
			else
				size = m - 1;

		}

		return -1;

	}

}
