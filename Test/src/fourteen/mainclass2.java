package fourteen;

class sample2 {
	int k = 34;

	void sample1() {
		System.out.println("Running user defined constructor");
		k = 72;
		k = 99;
	}

	void test() {
		System.out.println("Running test .....");
	}
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample2 obj1 = new sample2();
		obj1.test();
		System.out.println("K value:" + obj1.k);
		System.out.println("program started");
	}
}
