package first;

public class Ascii {

	public static void main(String args[]) {
		
		int n = 10;
		
/*		for(int i=97;i<97+26;i++) {
			char c = (char) i;
			System.out.println(i+" : "+Character.toString(c));
				
		}
		
		
		System.out.println("Capital");
		for(int i=65;i<65+26;i++) {
			char c = (char) i;
			System.out.println(i+" : "+Character.toString(c));
				
		}*/
		
		
		int[] no = {3,5,8,5};
		
		System.out.println("Capital");
		for(int i: no) {
			char c = (char) (97 +(i-1));
			System.out.print(c);
		}
		
		int[] array = new int[10];
		array  = new int[20];
		System.out.println(array.length);
		
	}
	
}

