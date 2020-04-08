package codeChallenge30Days;

import java.util.ArrayList;
import java.util.List;

public class FindSeriesAndForm {
	public static void main(String[] args) {
		System.out.println(findSeriesAndPrint(12));
	}

	public static List<Integer> findSeriesAndPrint(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(n);
			if (i % 2 == 0) {
				n += 2;
			} else {
				n--;
			}

		}
		return list;
	}

}
