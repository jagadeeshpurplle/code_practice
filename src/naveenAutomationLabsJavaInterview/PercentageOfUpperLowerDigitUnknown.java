package naveenAutomationLabsJavaInterview;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.colorchooser.DefaultColorSelectionModel;

public class PercentageOfUpperLowerDigitUnknown {

	public static void main(String[] args) {

		getPercentage("Jagadeesh TummMalcharLA n120092");

	}

	public static void getPercentage(String s) {
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int unknownCount = 0;
	
	
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerCount++;
			}else if(Character.isUpperCase(ch)) {
				upperCount++;
			}else if(Character.isDigit(ch)) {
				digitCount++;
			}else {
//				unknownCount++;

				Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
				Matcher match = pattern.matcher(String.valueOf(ch));
				if(match.find()) {
					unknownCount++;
				}
			}
		}
		
		double lowerPercentage = (lowerCount * 100.0)/s.length();
		double upperPercentage = (upperCount * 100.0)/s.length();
		double digitPercentage = (digitCount * 100.0)/s.length();
		double unknownPercentage = (unknownCount * 100.0)/s.length();
		
		DecimalFormat format = new DecimalFormat("##.##");
		
		System.out.println("lowerPercentage: "+format.format(lowerPercentage));
		System.out.println("upperPercentage: "+format.format(upperPercentage));
		System.out.println("digitPercentage: "+format.format(digitPercentage));
		System.out.println("unknownPercentage: "+format.format(unknownPercentage));
		
		
	}

}
