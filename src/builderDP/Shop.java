package builderDP;

public class Shop {
	
	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOs("Windows").setBattery(300).getPhone();
		System.out.println(phone);
	}

}
