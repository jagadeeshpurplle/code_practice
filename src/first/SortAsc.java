package first;

public class SortAsc {

	public static void main(String args[]) {
		
		int n = 60085;
		int reverse =0;
/*		 while(n != 0)
	      {
	          reverse = reverse * 10;
	          System.out.println(reverse);
	          reverse = reverse + n%10;

	          System.out.println(reverse);
	          n = n/10;
	          System.out.println(n);
	      }
		System.out.println(reverse);*/
		int reverse3 = 0;
		
		while(n!=0) {
			
			reverse3 = reverse3 * 10;
			reverse3 = reverse3 + n%10;
			n= n/10;
		}
		
		System.out.println(reverse3);
		reverse3 = 0;
		n = 60085;

		
		for(;n!=0;n/=10) {
			int d = n % 10;
			reverse3 = reverse3 * 10 + d;
		}
		
		System.out.println(reverse3);
		
		
/*		
		
		int reverse2 = 0;
		
		while(n!=0) {
			
			reverse2 = reverse2 * 10;
			reverse2 =reverse2 +  n%10;
//			System.out.println(reverse2);
			n = n/10;
			
		}
		System.out.println(reverse2);
		*/
/*		
		int no = 12345, rev =0;
		for(;no!=0;no/=10) {
			int digit = no % 10 ;
			rev = rev * 10 + digit;
		}
		
		System.out.println(rev);*/
		
		
	}
	
}
