package ninteen;

class demo3 {
	int k = 12;

	void test() {
		System.out.println("running test() method");
	}
}

class sample3 {
	boolean b = true;
	// composition method
	demo3 obj1 = new demo3();

	void disp() {
		System.out.println("running disp() method");
	}
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample3 ref1 = new sample3();
		// composition method
		System.out.println("k value:" + ref1.obj1.k);
		ref1.obj1.test(); // composition method
		System.out.println("b value:" + ref1.b);
		ref1.disp();
		System.out.println("program started");
	}
}
