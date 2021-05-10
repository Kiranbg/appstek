package twenty;

//Inheritance concept, multilevel inheritance
class demo2 {
	int k = 50;

	void test() {
		System.out.println("running test() method");
	}
}

//extends keyword inherits demo1 class to sample1 class
class sample2 extends demo2 {
	boolean b = false;

	void disp() {
		System.out.println("running disp() method");
	}
}

//extends keyword inherits sample1 class to run1 class
class run2 extends sample2 {
	double d = 56.65;

	void view() {
		System.out.println("running view() method");
	}
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		run2 ref1 = new run2();
		System.out.println("k value:" + ref1.k);
		ref1.test();
		System.out.println("b value:" + ref1.b);
		ref1.disp();
		System.out.println("d value:" + ref1.d);
		ref1.view();
		System.out.println("program started");
	}
}
