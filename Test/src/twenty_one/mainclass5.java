package twenty_one;

//implicit constructor call
class sample1 {
	sample1() {
		System.out.println("running sample() constructor");
	}
}

class demo1 extends sample1 {
	demo1() {
		System.out.println("running demo() constructor");
	}
}

class mainclass5 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo1 obj1 = new demo1();
		System.out.println("program started");
	}
}
