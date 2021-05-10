package ninteen;

class sample1 {
	int k = 34;
	double d = 5.6;

	void disp() {
		System.out.println("running disp() of sample1 class");
	}
}

class demo1 {
	void test(sample1 arg1) {
		System.out.println("running test() of demo1 class");
		System.out.println("k value:" + arg1.k);
		System.out.println("d value:" + arg1.d);
		arg1.disp();
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo1 obj1 = new demo1();
		obj1.test(new sample1());
		System.out.println("program started");
	}
}
