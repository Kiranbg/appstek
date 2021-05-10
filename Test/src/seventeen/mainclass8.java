package seventeen;

class car2 {
	static int count;

	car2() {
		System.out.println("creating car instance");
		count++;
	}

	static void totalcars() {
		System.out.println("total cars manufactured:" + count);
	}
}

class mainclass8 {
	public static void main(String[] args) {
		System.out.println("program started");
		for (int i = 1; i <= 10; i++) {
			new car2();
			car2.totalcars();
			System.out.println("program started");
		}
	}
}
