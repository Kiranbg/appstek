package twenty_one;

// explicit constructor call

class sample2 {
	sample2(int arg) {
		System.out.println("Running sample2() constructor");
		System.out.println("arg value is :" + arg);
	}
}

class demo2 extends sample2 {
	demo2() {
		super(20); // this calls the constructor explicitly
		System.out.println("Running demo2() constructor");
	}
}

class mainclass6 {
	public static void main(String[] args) {
		System.out.println("program started");
		new demo2();
		System.out.println("program ended");
	}
}
