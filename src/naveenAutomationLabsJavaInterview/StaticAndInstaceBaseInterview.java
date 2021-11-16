package naveenAutomationLabsJavaInterview;

public class StaticAndInstaceBaseInterview {
	
	//what is static block in java
		// static block will executed at the time of class loading, then only main method will be exeucted
	
	static {
		System.out.println("static block 1");
	}	
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}	
	
	
	//running a java program without creating a object for it
		// we can run it by using static blocks or by calling static method by using className
	
	public static void test() {
		System.out.println("static block without object creation");
	}
	
	
	//how we can creating objects if we make constructor private
	int age;
	private StaticAndInstaceBaseInterview() {
		age=30;
	}
	static {
		StaticAndInstaceBaseInterview obj = new StaticAndInstaceBaseInterview();
	}
	public static int createObjectWhenConstrctorIsPrivate() {
		StaticAndInstaceBaseInterview obj = new StaticAndInstaceBaseInterview();
		obj.age = 40;
		return obj.age;
	}
	public static void main(String[] args) {
		test();
		StaticAndInstaceBaseInterview.test();

		StaticAndInstaceBaseInterview object = new StaticAndInstaceBaseInterview();
		System.out.println(object.age);
	}

}

class test{

	public static void main(String[] args) {
		System.out.println(StaticAndInstaceBaseInterview.createObjectWhenConstrctorIsPrivate());
	}
	
}
