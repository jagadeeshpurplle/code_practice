package first;

import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNoGeneration {

	public static String phoneNumberGeneration() {

		Random rand = new Random();
		int num1 = (9) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String phoneNumber = df3.format(num1) + "" + df3.format(num2) + "" + df4.format(num3);
		return phoneNumber;
	}

	public static void main(String[] args) {
		System.out.println(PhoneNoGeneration.phoneNumberGeneration());
	}
}
