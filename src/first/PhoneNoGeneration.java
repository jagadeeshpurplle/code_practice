package first;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PhoneNoGeneration {

	public static String phoneNumberGeneration() {

		Random rand = new Random();
		int num1 = (9) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);
		return phoneNumber;
	}

	public static void main(String[] args) {
		System.out.println(PhoneNoGeneration.phoneNumberGeneration());
		test();
	}
	
	public static void test() {
		 int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+"dude ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
	
}
