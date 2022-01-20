package test;



//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class Pattern {

	
	public static void main(String[] args) {
		printPattern(10);
	}
	
	
	public static void printPattern(int max) {
		
		for(int i=0;i<=max;i++) {
			
			for(int k=i;k<max;k++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>=0;j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for(int i=max;i>=0;i--) {
			
			for(int k=i;k<max;k++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>=0;j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
}
