package twenty;

//Inheritance concept, hierarchical inheritance
class demo3 {
	int k = 50;

	void test() {
		System.out.println("running test() method");
	}
}

//extends keyword inherits demo1 class to sample1 class
class sample3 extends demo3 {
	boolean b = false;

	void disp() {
		System.out.println("running disp() method");
	}
}

//extends keyword inherits demo1 class to run1 class
class run3 extends demo3 {
	double d = 56.65;

	void view() {
		System.out.println("running view() method");
	}
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample1 ref1 = new sample1();
		System.out.println("k value:" + ref1.k);
		ref1.test();
		System.out.println("b value:" + ref1.b);
		ref1.disp();
		System.out.println("......................................");
		run2 ref2 = new run2();
		System.out.println("k value:" + ref2.k);
		ref2.test();
		System.out.println("d value:" + ref2.d);
		ref2.view();
		System.out.println("program started");
	}
}
