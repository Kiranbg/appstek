package eight;

class program5 {
	public static void main(String[] args) {
		System.out.println("program started");
		String course = "java,sql,j2ee,android,frameworks";
		String[] strArr = course.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("program ended");
	}
}