package first;

public class FindSqrt {

	public static void main(String[] args) {
		int[] numbers = {64,16,4,49,36,3,5,7,10};
		
		for(int i=0;i<numbers.length;i++) {
			
			double d= Math.sqrt(numbers[i]);
			
			if(d - Math.floor(d) == 0) {
				System.out.println((int)d);
			}
		}
	}	
}
