package twenty_three;

//class typecasting 
class sample1 {
	int k = 23;
	char x = 'J';

	void test() {
		System.out.println("Running test() method....");
	}
}

class demo1 extends sample1 {
	boolean b = true;
	float f = 36.63f;

	void disp() {
		System.out.println("Running disp() method....");
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample1 ref1; // reference variable of type sample1
		// assign different class instance
		ref1 = new demo1(); // upcasting
		demo1 ref2;
		ref2 = (demo1) new sample1(); // gives Exception
		System.out.println("program ended");
	}
}
