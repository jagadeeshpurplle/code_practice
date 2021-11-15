package naveenAutomationLabsJavaInterview;

public class Print1to100WithoutNumbers {

	public static void main(String[] args) {
		
		int value = 'A'/'A';
		String max = "..........";
		
		//way1
		for(int i = value;i<(max.length()*max.length());i++) {
			System.out.println(i);
		}
		
		//way2
		for(int i= value;i<'d';i++) {
			System.out.println(i);
		}
	}
}
