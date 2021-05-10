package twenty;

//Inheritance concept, single level inheritance

class demo1 {
	int k = 50;

	void test() {
		System.out.println("running test() method");
	}
}

//extends keyword inherits demo1 class to sample1 class
class sample1 extends demo1 {
	boolean b = false;

	void disp() {
		System.out.println("running disp() method");
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample1 ref1 = new sample1();
		System.out.println("k value:" + ref1.k);
		ref1.test();
		System.out.println("b value:" + ref1.b);
		ref1.disp();
		System.out.println("program started");
	}
}
