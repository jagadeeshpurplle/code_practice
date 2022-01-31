package factoryDP;

public class MainClass {

	public static void main(String[] args) {
		OSFactoryDP osf = new OSFactoryDP();
		OS os = osf.getOS("windows");
		os.spec();
	}
}
