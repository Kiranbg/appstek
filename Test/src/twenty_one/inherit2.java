package twenty_one;

class disp {
	int i, j;

	disp() {
	}

	disp(int i) {
		System.out.println("i and j values are :" + i +" and "+j);
	}
}

class b1 extends disp {
	int k;

	b1(int i, double k) {
		System.out.println("i and j values are :" + i +" and " +j);
		System.out.println("k value is :" + k);
	}
	/*
	 * sum(int sum) { System.out.println("sum of value i, j and k is :"+(i+j+k)); }
	 */
}

class inherit2 {
	public static void main(String[] args) {
		System.out.println("program started");
		disp obj1 = new disp(3);
		b1 obj2 = new b1(5, 6.7);
		/*
		 * b obj2=new b(5,6,7); obj1.i=10; obj1.j=20; obj1.disp(); obj2.i=4; obj2.j=8;
		 * obj2.k=12; obj2.disp(); obj2.sum();
		 */
		System.out.println("program ended");
	}
}
