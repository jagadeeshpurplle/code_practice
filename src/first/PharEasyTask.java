package first;

import java.util.HashMap;

public class PharEasyTask {


	static String s = "ABBBBCBDDEEEEFGH";


public static void main(String args[]) {
	
	System.out.println(tranform(s));
	
	
}

	public static  StringBuilder tranform(String input) {

	    StringBuilder finalOutput = new StringBuilder();
	    String s = "";
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    
	    char[] charsinput = input.toCharArray();
	    
	    char present =' '; 
	    char next = ' ';
	    
	    for(int i=0;i<charsinput.length;i++){ 
	        present = charsinput[i]; //A B H
	        if(i!=charsinput.length-1){
	         next = charsinput[i+1]; //B B 
	        }
	       
	        
	        if(map.containsKey(charsinput[i])){ //A
	            map.put(charsinput[i], map.get(charsinput[i])+1);
	            
	        }else{
	            map.put(charsinput[i], 1); //A B
	            
	        }
	        if(i!=charsinput.length-1){
	        	if(present == next){ // A == B
	        		continue;
	        	}else{
	        		finalOutput.append(charsinput[i]+""+map.get(charsinput[i])); // 1A
	        		map.remove(charsinput[i]);
	        	}
	        	
	        }else {
	        	finalOutput.append(charsinput[i]+""+map.get(charsinput[i])); // 1A
	        }
	          
	    }
		return finalOutput;
	}
}
