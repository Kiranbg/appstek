package sixteen;

class car {
	int k;
	double d;
	static int count;

	{
		count++;
	}

	car() {
		System.out.println("Running no arg method");
	}

	car(int arg1) {
		System.out.println("Running int arg method");
		k = arg1;
	}

	car(double arg2) {
		System.out.println("Running double arg method");
		d = arg2;
	}

	car(int arg1, double arg2) {
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
		car obj1 = new car();
		obj1.dispDataMembers();

		car obj2 = new car(10);
		obj2.dispDataMembers();

		car obj3 = new car(13.25);
		obj3.dispDataMembers();

		car obj4 = new car(10, 50.65);
		obj4.dispDataMembers();
		System.out.println("Number of objects created are: " + count);
	}
}
