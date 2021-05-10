package twenty_three;

class sample2 {
	int k = 23;
	char x = 'J';

	void test() {
		System.out.println("Running test() method....");
	}
}

class demo2 extends sample2 {
	boolean b = true;
	float f = 36.63f;

	void disp() {
		System.out.println("Running disp() method....");
	}
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample2 ref1; // reference variable of type sample2
		// assign different class instance
		ref1 = new demo2(); // upcasting
		System.out.println("k value is:" + ref1.k);
		System.out.println("x value is:" + ref1.x);
		ref1.test();

		System.out.println("program ended");

	}
}
