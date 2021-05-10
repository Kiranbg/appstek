package ninteen;

class demo4 {
	int k = 50;

	void test() {
		System.out.println("running test() method");
	}
}

class sample4 {
	boolean b = false;
	// composition method, static reference variable
	static demo4 obj1 = new demo4();

	void disp() {
		System.out.println("running disp() method");
	}
}

class mainclass4 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample4 ref1 = new sample4();
		// composition method
		System.out.println("k value:" + sample4.obj1.k);
		sample4.obj1.test(); // composition method
		System.out.println("b value:" + ref1.b);
		ref1.disp();
		System.out.println("program started");
	}
}
