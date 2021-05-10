package twenty_one;

class aa {
	int i, j;

	void disp() {
		System.out.println("i and j values are :" + i + " and " + j);
	}
}

class bb extends aa {
	int k;

	void disp() {
		System.out.println("i and j values are :" + i + " and " + j);
		System.out.println("k value is :" + k);
	}

	void sum() {
		System.out.println("sum of value i, j and k is :" + (i + j + k));
	}
}

class inherit1 {
	public static void main(String[] args) {
		System.out.println("program started");
		aa obj1 = new aa();
		bb obj2 = new bb();
		obj1.i = 10;
		obj1.j = 20;
		obj1.disp();
		obj2.i = 4;
		obj2.j = 8;
		obj2.k = 12;
		obj2.disp();
		obj2.sum();
		System.out.println("program started");
	}
}
