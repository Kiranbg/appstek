package twenty_two;

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		int x1 = (int) 59.99; // explicit narrowing
		System.out.println("x1 value is:" + x1);
		double y1 = 20; // implicit widening
		System.out.println("y1 value is:" + y1);

		int a = 35;
		double b = 21.11;

		int x2 = (int) b; // explicit narrowing
		System.out.println("x2 value is:" + x2);
		double y2 = a; // implicit widening
		System.out.println("y2 value is:" + y2);

		System.out.println("program ended");

	}
}
