package first;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>();
		int k = 1;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		for(int i=10;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 10; i >=0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for(int l=i;l<10;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		System.out.println(2*(5-0));
	}
}