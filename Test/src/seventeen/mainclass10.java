package seventeen;

class sample1 {
	int k = 12;
	{
		System.out.println("Running non static block");
		k = 34;
	}

	sample1() {
		System.out.println("Running constructor");
		k = 56;
	}
}

class mainclass10 {
	public static void main(String[] args) {
		System.out.println("program started");
		sample1 obj1 = new sample1();
		System.out.println("k value:" + obj1.k);
		System.out.println("program started");
	}
}
