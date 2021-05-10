package seventeen;

class car1 {
	static int count;

	car1() {
		System.out.println("creating car instance");
		count++;
	}

	static void totalcars() {
		System.out.println("total cars manufactured:" + count);
	}
}

class car {

	public static void main(String[] args) {
		System.out.println("program started");
		for (int i = 1; i <= 10; i++) {
			new car1();
		}
		System.out.println("program started");
		car1.totalcars();
	}
}
