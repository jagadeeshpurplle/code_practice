package naveenAutomationLabsJavaInterview;

import java.io.IOException;

public class LaunchAppsUsingJava {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Runtime runtime = Runtime.getRuntime();
		
//		Process pr = runtime.exec("notepad.exe");
//		Process pr = runtime.exec("notepad.exe C:\\Users\\tummj\\Desktop\\sample.txt");
//		Thread.sleep(3000);
//		pr.destroy();
		
		
		String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","https://www.google.com"};
		Process pr1 = runtime.exec(s);
		Thread.sleep(2000);
		pr1.destroy();
	}
	
}
