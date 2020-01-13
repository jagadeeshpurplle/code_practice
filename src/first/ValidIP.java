package first;

public class ValidIP {

	public static void main(String args[]) {

		System.out.println(ipv4Check("101.2.2.920"));

		System.out.println(validIpCheck("1200::AB00:1234::2552:7777:1313"));
	}

	public static boolean ipv4Check(String ipAddress) {

		try {
			if (ipAddress != null && !ipAddress.isEmpty()) {
				String[] ip = ipAddress.split("\\.");
				if (ip.length != 4)
					return false;

				for (int i = 0; i <= ip.length - 1; i++) {
					int j = Integer.parseInt(ip[i]);
					if (j < 0 || j > 255) {
						return false;
					}
				}
				if (ipAddress.endsWith(".")) {
					return false;
				}
				if (ipAddress.startsWith(".")) {
					return false;
				}

			}
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean validIpCheck(String ip) {

		int count = 0;
		if (ip.indexOf(":") == -1) { // ipv4

			for (String s : ip.split("\\.")) {
				++count;
				if (count > 4 || s.isEmpty() || (s.length() > 1 && s.charAt(0) == '0') || s.length() > 3) {
					return false;
				}
				for (char c : s.toCharArray()) {
					if (!(c > '0' || c < '9')) {
						return false;
					}
				}
				int val = Integer.parseInt(s);
				if (val < 0 || val > 255) {
					return false;
				}

			}
			return count == 4 && ip.charAt(ip.length() - 1) != '.' ? true : false;

		} else { // ipv6
			for (String s : ip.split(":")) {
				++count;
				if (count > 8 || s.isEmpty() || s.length() > 4) {
					return false;
				}
				for (char c : s.toCharArray()) {
					if (!(c >= '0' && c <= '9') && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F')) {
						return false;
					}
				}
			}
		}
		return count == 8 && ip.charAt(ip.length() - 1) != ':' ? true : false;

	}

}
