package first;

public class Factorial {

	
	public static void main(String args[]) {
	
		int n = 36;
		
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact =  fact * i;
			
		}
		System.out.println(fact);
	}
	
	
}
