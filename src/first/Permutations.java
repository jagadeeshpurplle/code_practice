package first;

public class Permutations {
	// Function for swapping the characters at position I with character at position
	// j
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static void main(String[] args) {
		String str = "1234";
		int len = str.length();
		System.out.println("All the permutations of the string are: ");
		generatePerm(str, 0, len);
	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String str, int start, int end) {

//		System.out.println(start + " : " + end);
		// Prints the permutations
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
//				System.out.println(str);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
//				System.out.println(str + " : " + start + ":");
				str = swapString(str, start, i);
			}
		}
	}

	public static void generatePerm(String str, int start, int end) {

		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {

				str = swap(str, start, i);

				generatePerm(str, start + 1, end);

				str = swap(str, start, i);

			}

		}

	}

	public static String swap(String s, int i, int j) {

		char[] chars = s.toCharArray();
		char ch;

		ch = s.charAt(i);
		chars[i] = chars[j];
		chars[j] = ch;

		return String.valueOf(chars);

	}
}
