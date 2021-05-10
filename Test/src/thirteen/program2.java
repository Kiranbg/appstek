package thirteen;

class demo2 {
	static int x1 = 10;

	static void test() {
		System.out.println("running test() method");
	}

	void run() {
		System.out.println("running run() method");
	}
}

class program2 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo2 d2 = new demo2();
		d2.run();
		demo2.test();
		System.out.println("x1 value is: " + demo2.x1);
		System.out.println("program started");
	}
}