package first;

public class Equillibrun {

	public static void main(String[] args) {

		findEqulibrum(new int[] { 1, 2, 6, 4, 0, -1, 2, 8 });
	}

	public static void findEqulibrum(int[] integers) {
//		[1, 2, 6, 4, 0, -1]

		if (integers.length == 1)
			System.out.println("equlibrum is : " + integers[0]);
		else if (integers.length == 2)
			System.out.println("no equillibrum as it has 2 nummber only");

		int[] sums = new int[integers.length];

		int sum = 0;

		for (int i = 0; i < integers.length; i++) {
			sum = sum + integers[i];
			sums[i] = sum;
		}
		int total = sums[sums.length - 1];
		for (int j = 1; j < integers.length - 1; j++) {
			int leftSum = sums[j] - integers[j];
			int rightSum = total - sums[j];
			if (leftSum == rightSum)
				System.out.println("equilibrum is : " + integers[j]);

		}
	}
}
