package seventeen;

class car3 {
	String brand;
	static int count;

	car3() {
		System.out.println("creating car instance");
		count++;
	}

	car3(String arg1) {
		System.out.println("creating car instance using brand name:" + arg1);
		count++;
	}

	static void totalcars() {
		System.out.println("total cars manufactured:" + count);
	}
}

class mainclass9 {
	public static void main(String[] args) {
		System.out.println("program started");
		for (int i = 0; i <= 10; i++) {
			new car3("AUDI");
		}
		car3.totalcars();
		System.out.println("program started");
	}
}
