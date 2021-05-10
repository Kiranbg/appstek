package nine;

class demo1 {
	static void test() {
		System.out.println("running user defined method test");
	}
}

class demo2 {
	static void display() {
		System.out.println("running user defined method display");
	}
}

class demo3 {
	public static void main(String[] args) {
		System.out.println("running demo class");
		new demo1();
		demo1.test();
		new demo2();
		demo2.display();
	}
}
