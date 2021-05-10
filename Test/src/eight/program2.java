package eight;

class program2 {
	public static void main(String[] args) {
		System.out.println("program started");
		String str = "javadeveloper";
		System.out.println("Given string is:" + str);
		boolean b1 = str.contains("dev");
		System.out.println("contains dev: " + b1);
		boolean b2 = str.startsWith("java");
		System.out.println("starts with java:" + b2);
		boolean b3 = str.endsWith("per");
		System.out.println("ends with per:" + b3);
		String s1 = str.substring(8);
		System.out.println(s1);
		String s2 = str.substring(4, 11);
		System.out.println(s2);
		String s3 = str.toUpperCase();
		System.out.println(s3);
		System.out.println("program ended");
	}
}