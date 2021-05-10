package ten;

class demo1 {
	static void test() {
		System.out.println("running user defined method");
	}
}

class demo2 {
	static void display() {
		System.out.println("running user defined method");
	}
}

class mainclass {
	public static void main(String[] args) {
		System.out.println("running demo class");
		demo1 obj1 = new demo1();
		obj1.test();
	}
}
