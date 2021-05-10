package fifteen;

class sample3 {
	int k;
	double d;

	sample3(int arg1, double arg2) {
		System.out.println("Running two argument constructor");
		k = arg1;
		d = arg2;
	}

	void dispDataMembers() {
		System.out.println("k value is" + k);
		System.out.println("d value is" + d);
	}

	public static void main(String[] args) {
		System.out.println("Program started");
		sample3 obj1 = new sample3(10, 19.98);
		obj1.dispDataMembers();
		sample3 obj2 = new sample3(40, 59.48);
		obj2.dispDataMembers();
		System.out.println("Program ended");
	}
}
