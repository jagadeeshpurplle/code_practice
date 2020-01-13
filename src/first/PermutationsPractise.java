package first;

public class PermutationsPractise {

	public static void main(String args[]) {
		
		String s = "Jagadeesh";
		
		permute(s, 0, s.length());
		
	}
	
	public static void permute(String str, int start, int end) {
		
		if(start == end-1) {
			System.out.println(str);
		}else {
			for(int i=start; i<end;i++) {
				
				str = swap(str, start, i);
				
				permute(str, start+1, end);
				
				str = swap(str, start, i);
				
			}
		}
		
	}
	
	public static String swap(String str, int i, int j) {
		
		char[] c = str.toCharArray();
		char temp;
		temp = c[i];
		c[i]=c[j];
		c[j]= temp;
		
		return String.valueOf(c);
	}
	
}
