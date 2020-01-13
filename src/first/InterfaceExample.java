package first;

public class InterfaceExample {

	public static void main(String[] args) {
		Abc obj = new AbcImplement();
		obj.show();
		Xyz obj1 = () -> System.out.println("showing");
		obj1.show();
	}

}

interface Abc {
	void show();
}

class AbcImplement implements Abc {

	@Override
	public void show() {
		System.out.println("showing");
	}

}

interface Xyz {
	void show();
}
