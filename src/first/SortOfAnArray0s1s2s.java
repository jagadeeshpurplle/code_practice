package first;

import java.util.Arrays;

public class SortOfAnArray0s1s2s {

	public static void main(String[] args) {

		getSortedArray(new int[] { 0, 1, 2, 0, 1, 2 });
	}

	public static void getSortedArray(int[] array) {
		int l = 0, m = 0, h = array.length - 1;

		while (m <= h) {
			if (array[m] == 0) {
				int temp = array[l];
				array[l] = array[m];
				array[m] = temp;
				l++;
				m++;
				continue;

			}
			if (array[m] == 1) {
				m++;
				continue;
			}

			if (array[m] == 2) {
				int temp = array[h];
				array[h] = array[m];
				array[m] = temp;
				h--;
				continue;
			}
		}

		System.out.println(Arrays.toString(array));

	}
}
