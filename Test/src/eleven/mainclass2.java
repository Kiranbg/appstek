package eleven;

class demo2 {
	int x1 = 20;
	int x2 = 30;
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		demo2 obj1 = new demo2();
		demo2 obj2 = new demo2();

		System.out.println("x1 value of first instance" + obj1.x1);
		System.out.println("x2 value of first instance" + obj1.x2);

		System.out.println("rearranging the values to first instance");
		obj1.x1 = 50;
		obj1.x2 = 60;
		System.out.println("x1 value of second instance" + obj2.x1);
		System.out.println("x2 value of second instance" + obj2.x2);

		System.out.println("x1 value of first instance" + obj1.x1);
		System.out.println("x2 value of first instance" + obj1.x2);
		System.out.println("program ended");
	}
}
