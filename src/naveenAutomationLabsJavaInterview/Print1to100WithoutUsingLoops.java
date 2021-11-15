package naveenAutomationLabsJavaInterview;

import java.util.stream.IntStream;

public class Print1to100WithoutUsingLoops {

	public static void main(String[] args) {
		//recursive
		printNumbers(1);
		
		//stream
		IntStream.range(1, 101).forEach(i -> System.out.println(i));
	}

	private static void printNumbers(int i) {
		
		if(i<=100) {
			System.out.println(i);
			i++;
			printNumbers(i);
		}
	}
}
