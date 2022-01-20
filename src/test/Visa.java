package test;

public class Visa {

	public static void main(String[] args) {
		
		for(int i=100;i<999;i++) {
			printArmstrong(i);
		}
	}
	
	
	public static void printArmstrong(int number) {
		int copyNumber = number;
		int sum =0;
		while(number !=0) {
			int digit = number % 10;
			sum += Math.pow(digit, 3);
			number /=10;
		}
		
		if(sum == copyNumber) {
			System.out.println("Number "+copyNumber +" is a armstrong number");
		}
		
	}
	
}
