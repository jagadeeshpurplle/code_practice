package naveenAutomationLabsJavaInterview;

public class PrintHelloWorldWithoutUsingSemicolon {

	public static void main(String[] args) {
		
		//1
		if(System.out.printf("Hello world.!\n") == null) {
			
		}
		
		//2
		if(System.out.append("Hello world.!\n") == null) {
			
		}
		
		//3
		for(int i=0;i<1;System.out.print("Hello world.!")) {
			i++;
		}

	}
}
