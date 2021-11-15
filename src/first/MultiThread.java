package first;


class A extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start();
		obj2.start();
		
	}
}
