package eleven;

class demo1 {
	int x = 12;

	void test() {
		System.out.println("running non-static method");
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo1 obj1 = new demo1();
		System.out.println("x value:" + obj1.x);
		obj1.test();
		System.out.println("obj1 value: " + obj1);
		System.out.println("program ended");
	}
}
