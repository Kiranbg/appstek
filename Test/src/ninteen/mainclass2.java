package ninteen;

class sample2 {
	int k = 34;
	double d = 5.6;

	void disp() {
		System.out.println("running disp() of sample1 class");
	}
}

class demo2 {
	void test(sample2 arg1) {
		System.out.println("running test() of demo1 class");
		System.out.println("k value:" + arg1.k);
		System.out.println("d value:" + arg1.d);
		arg1.disp();
	}
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo2 obj1 = new demo2();
		sample2 obj2 = new sample2();
		obj1.test(obj2);
		System.out.println("program started");
	}
}
