package twenry_four;

// introduction to polymorphism
class sample1 {
	int i = 12;
	char c = 'C';

	void test() {
		System.out.println("Running test method");
	}
}

class demo1 extends sample1 {
	float f = (float) 12.21;
	boolean b = true;

	void disp() {
		System.out.println("Running disp method");
	}
}

class run1 extends demo1 {
	double d = 21.33;
	long l = 12345l;

	void view() {
		System.out.println("Running view method");
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println(".................................");
		run1 r1 = new run1();
		// using r1 reference we can access all its super class properties
		r1.test();
		r1.disp();
		r1.view();
		System.out.println(".................................");

		demo1 d1 = r1;
		// using d1 reference we can access demo1, sample1 class properties
		d1.test();
		d1.disp();
		System.out.println(".................................");

		sample1 s1 = r1;
		// using d1 reference we can access only sample1 class properties
		s1.test();
		System.out.println(".................................");

		System.out.println("program ended");

	}
}
