package twenty_one;

class sample3 {

	sample3(boolean arg) {
		System.out.println("Running boolean constructor");
	}

	sample3(double arg) {
		this(true);
		System.out.println("Running double arg constructor");
		System.out.println("double arg value is: " + arg);
	}

	sample3(int arg) {
		this(2.1);
		System.out.println("Running int arg constructor");
		System.out.println("int arg value is: " + arg);
	}

	sample3() {
		this(1);
		System.out.println("Running no arg constructor");
	}

}

class mainclass7 {
	public static void main(String[] args) {
		System.out.println("program started");
		new sample3();
		System.out.println("program started");
	}
}
