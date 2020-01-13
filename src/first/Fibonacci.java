package first;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		// input to print Fibonacci series upto how many numbers
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + number + " numbers : ");
		// printing Fibonacci series upto number
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacciPractice(i) + " ");
		}

	}

	/*
	 * * Java program to calculate Fibonacci number using loop or Iteration.
	 * * @return Fibonacci number
	 */
	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;

		for (int i = 3; i <= number; i++) {
			// Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibo1 + fibo2; // 2 3
			fibo1 = fibo2; // 1 2
			fibo2 = fibonacci; // 2 3

		}
		return fibonacci; // Fibonacci number

	}

	public static int fibonacciPractice(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}
		int fib1 = 1, fib2 = 1, fibonacci = 1;

		for (int i = 3; i <= number; i++) {
			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
		}

		return fibonacci;

	}
}
