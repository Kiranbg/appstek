package fourteen;

class sample1 {
	int k = 34;

	sample1() {
		System.out.println("Running user defined constructor");
	}

	void test() {
		System.out.println("Running test .....");
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample1 obj1 = new sample1();
		obj1.test();
		System.out.println("K value:" + obj1.k);
		System.out.println("program started");
	}
}
