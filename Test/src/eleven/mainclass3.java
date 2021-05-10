package eleven;

class demo3 {
	double y1 = 34.56;
	boolean b1 = false;
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo3 obj1 = new demo3();
		demo3 obj2 = obj1;

		System.out.println("obj1 value :" + obj1);
		System.out.println("obj2 value :" + obj2);

		obj1.y1 = 67.65;
		obj2.b1 = true;
		System.out.println("y1 value: " + obj1.y1);
		System.out.println("b1 value: " + obj2.b1);
		System.out.println("program started");
	}
}
