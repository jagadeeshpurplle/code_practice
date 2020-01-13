package first;

import java.util.Arrays;

public class StringSearch {

	public static boolean searchString(String[] arr, String value) {

		if (Arrays.toString(arr).contains(value)) {
			return true;
		}

		return false;
	}

	public static boolean searchStringAnotherWay(String[] arr, String value) {

		for (String s : arr) {
			if (s.equals(value)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(searchString(new String[] { "jagadeesh", "surendra", "chinna", "prasanna" }, "jagadeesh"));
		System.out.println(
				searchStringAnotherWay(new String[] { "jagadeesh", "surendra", "chinna", "prasanna" }, "jagadeesh"));

	}
}
