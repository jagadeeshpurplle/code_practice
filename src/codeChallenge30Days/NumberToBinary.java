package codeChallenge30Days;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberToBinary {

	
	public static void main(String[] args) {
		
		System.out.println(decimalToBinary(134));
		System.out.println(binaryToDecimal(decimalToBinary(134)));
		System.out.println(binaryToDecimal2(Integer.parseInt(decimalToBinary(134))));

	}
	
	
	public static String decimalToBinary(int decimal) {
	
		String binay = "";
		
		while(decimal > 0) {
			binay = binay +"" +decimal%2;
			decimal = decimal/2;
		}
		
		return binay;
	}
	
	public static int binaryToDecimal(String binary) {
		
		return Integer.parseInt(binary,2);
	}
	
	
	public static double binaryToDecimal2(int binary) {
		// 11011
		// 1*2 power 0 + 1*2 power 1 + 0*2 power 2 + 1*2 power 3 + 1*2 power 4
		double decimal = 0;
		int power =String.valueOf(binary).length();
		while(binary!=0) {
			int temp = binary%10;
			decimal = decimal + (temp * Math.pow(2, power));
			binary = binary/10;
			power--;
		}
		return decimal;
	}
	
}
