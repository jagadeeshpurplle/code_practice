package factoryDP;

public class OSFactoryDP {
	
	public OS getOS(String os) {
		if(os.equalsIgnoreCase("android"))
			return new Android();
		else if(os.equalsIgnoreCase("ios"))
			return new IOS();
		else if(os.equalsIgnoreCase("windows"))
			return new Windows();
		else 
			return null;
	}

}
