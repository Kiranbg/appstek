package eigteen;

class car {
	String brand;
	static int count;
	{
		count++;
	}

	car() {
		System.out.println("creating car instances");
	}

	car(String arg1) {
		System.out.println("creating car instances using brand name");
	}

	static void totalcars() {
		System.out.println("total cars manufactured:" + count);
	}
}

class mainclass1 {
	public static void main(String[] args) {
		System.out.println("program started");
		for (int i = 0; i <= 10; i++) {
			new car("AUDI");
			car.totalcars();
			System.out.println("program started");
		}
	}
}