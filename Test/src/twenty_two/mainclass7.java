package twenty_two;

class mainclass7 {
	static String uppercase(String arg) {
		// to convert string to array of character
		char arr[] = arg.toCharArray();
		// create temporary array of same size
		char tmp[] = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			// get ASCII values
			int k = arr[i];
			// get the upper case and to covert to character
			tmp[i] = (char) (k - 32);
		}
		// convert char array to string array
		String uprstr = new String(tmp);
		return uprstr;
	}

	public static void main(String[] args) {
		System.out.println("progran started");
		String str = "jspiders";
		System.out.println("given string is" + str);
		String s1 = uppercase(str);
		// user defined function
		System.out.println("string in uppercase:" + s1);
		System.out.println("progran ended");

	}
}
