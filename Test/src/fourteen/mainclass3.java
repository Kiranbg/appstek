package fourteen;

class sample3 {
	int k = 34;

	void sample1(int arg1) {
		System.out.println("Running user defined constructor");
		k = 99;
		k = arg1;
	}

	void test() {
		System.out.println("Running test .....");
	}
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample3 obj1 = new sample3();
		obj1.test();
		System.out.println("K value:" + obj1.k);
		System.out.println("program started");
	}
}
