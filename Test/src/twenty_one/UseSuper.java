package twenty_one;

// Using super to overcome name hiding.s
class A5 {
	int i;
}

// Create a subclass by extending class A.
class B5 extends A5 {
	int i; // this i hides the i in A

	B5(int a, int b) {
		super.i = a; // i in A
		i = b; // i in B
	}

	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

class UseSuper {
	public static void main(String args[]) {
		B5 subOb = new B5(1, 2);
		subOb.show();
	}
}