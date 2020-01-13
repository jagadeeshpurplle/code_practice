package first;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ValidInvalidRegax {
    
	public static void main(String[] args){
    
    	Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                java.util.regex.Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException exception){
                System.out.println("Invalid");
            }

        }
    }
	
	
}
