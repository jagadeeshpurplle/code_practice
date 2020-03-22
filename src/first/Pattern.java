package first;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String args[]) {

		staircase(6);
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		System.out.println(2*(5-0));

		for (int l = 0; l < 10; l++) {
			for (int j = (10 - l); j >= 0; j--) {
				System.out.print("  ");
			}
			for (int i = 0; i < l; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 10; i++) {
			for (int j = 10 - i; j >= 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 10; i++) {
			for (int j = (10 - i); j >= 0; j--) {
				System.out.print(" ");
			}

			for (int k = 10; k >= 10 - i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		int num = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = (10 - i); j >= 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print((char) num + " ");
//				System.out.println(num);
				num += 1;
			}
			System.out.println();
		}

		for (int i = 1; i < 10; i++) {
			int alphabet = 65; // ASCII value of A
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}

		for (int i = 0; i <= 10; i++) {
			for (int j = (10 - i); j >= 0; j--) {
				System.out.print(" ");
			}
			int alphabet = 65;
			for (int k = 10; k >= 10 - i; k--) {
				System.out.print((char) alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}

		for (int i = 0; i <= 10; i++) {
			int alphabet = 97;
			for (int j = 10 - i; j >= 0; j--) {
				System.out.print((char) alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}

		int alphabet = 65;
		for (int i = 1; i < 10; i++) {
			// ASCII value of A
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet + " ");

			}
			alphabet++;
			System.out.println();
		}

	}

	public static void staircase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = (n - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("#");
			}
			System.out.println();

		}

	}
}
