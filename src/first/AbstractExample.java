package first;

public class AbstractExample {

	public static void main(String[] args) {

		Jagadeesh_phone obj = new Yaswanth();
		obj.call();
		obj.move();
		obj.rotate();
		obj.flip();

		Iphone iphone = new Iphone();
		OnePlus onePlus = new OnePlus();
		show(iphone);
		show(onePlus);

	}

	public static void show(Phone obj) {
		obj.showConfig();
	}

}

abstract class Jagadeesh_phone {
	public void call() {
		System.out.println("calling");
	}

	public abstract void move();

	public abstract void rotate();

	public abstract void flip();
}

abstract class Surendra extends Jagadeesh_phone {

	@Override
	public void move() {
		System.out.println("moving");
	}
}

class Yaswanth extends Surendra {

	@Override
	public void rotate() {
		System.out.println("rotating");
	}

	@Override
	public void flip() {
		System.out.println("fliping");
	}
}

abstract class Phone {

	public abstract void showConfig();

}

class Iphone extends Phone {

	@Override
	public void showConfig() {
		System.out.println("3 gb ram, 11.0");
	}
}

class OnePlus extends Phone {

	@Override
	public void showConfig() {
		System.out.println("8gb ram, pie");
	}
}
