package first;

import java.util.Scanner;

public class Prime {

	public static void main(String args[]) {
		
		int n= 8;
		System.out.println(11/2);
		allPrimeNumbers(1,50);
		
		primeOrNor(8);
		
		while(true) {
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			
/*			if(number<=1) {
				System.out.println("Please enter number greater than 1");
				continue;
			}
			
			boolean flag = true;
			for(int i=2;i<=number/2;i++) {
				
				if(number%i==0) {
					flag = false;
				}
				
			}*/
			
			
			
			if(isPrime(number)) {
				System.out.println(number+ " Prime");
			}else {
				System.out.println(number+ " Not a prime numbers");
			}	
		}
	}
	
	public static void primeOrNor(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
			
		
		}
		
		if(count ==2) {
			System.out.println("prime");
		}else {
			System.out.println("Not a prime");
		}
		
	}
	
	
	public static boolean isPrime(int number) {

		if(number<=1) {
			System.out.println("Please enter number greater than 1");
			return false;
		}

		for(int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void allPrimeNumbers(int start, int end) {
		
		for(int i = start; i<=end; i++) {
			
			if(isPrime(i)) {
				System.out.println(i);
			}
		
		}
		
	}
	
	
}

