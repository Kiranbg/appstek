package fifteen;

class sample4 {
	int k;
	double d;

	sample4() {
		System.out.println("Running no arg method");
	}

	sample4(int arg1) {
		System.out.println("Running int arg method");
		k = arg1;
	}

	sample4(double arg2) {
		System.out.println("Running double arg method");
		d = arg2;
	}

	sample4(int arg1, double arg2) {
		System.out.println("Running int & double arg method");
		k = arg1;
		d = arg2;
	}

	void dispDataMembers() {
		System.out.println("k value is:" + k);
		System.out.println("d value is:" + d);
	}

	public static void main(String[] args) {
		System.out.println("Program started");
		sample4 obj1 = new sample4();
		obj1.dispDataMembers();

		sample4 obj2 = new sample4(10);
		obj2.dispDataMembers();

		sample4 obj3 = new sample4(13.25);
		obj3.dispDataMembers();

		sample4 obj4 = new sample4(10, 50.65);
		obj4.dispDataMembers();
		System.out.println("Program ended");
	}
}
