package codeChallenge30Days;

import java.awt.AlphaComposite;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
	        System.out.println(validParen("{[a[bc]d]e}}"));
//	        System.out.println(validParen("()"));
//	        System.out.println(validParen("()[]{}"));
//	        System.out.println(validParen("(]"));
//	        System.out.println(validParen("([)]"));
//	        System.out.println(validParen("{[]}"));
	}
	public static boolean validParen(String input) {

        if (input.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if((current >='A' && current <='Z')||(current >='a' && current <='z')) {
                	continue;
                }
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if(stack.isEmpty()) {
                          return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } else {
                        stack.pop();
                    }
                }
            }
            return true; 
        }
    }
	
	public static boolean validStringParan(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i =0;i<s.length();i++) {
			char currentChar = s.charAt(i);
			if((currentChar >= 'A' && currentChar <='Z') || (currentChar >= 'a' && currentChar <='z'))
				continue;
			if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(currentChar);
			}else {
				if(stack.isEmpty())
					return false;
				char peekChar = stack.peek();
				if((currentChar == '(' && peekChar != ')') || (currentChar == '[' && peekChar != ']') || (currentChar == '{' && peekChar != '}') )
					return false;
				else
					stack.pop();
			}
		}
		
		return true;
	}

}
