package fifteen;

class circle {
	double rad;
	final double pi = 3.142;
	double a1, c1;

	circle(double arg1) {
		System.out.println("Creating the circle of radious:" + arg1);
		rad = arg1;
	}

	void area() {
		System.out.println("calculating the area...");
		a1 = pi * rad * rad;
		System.out.println("area is:" + a1);
	}

	void circum() {
		System.out.println("Calculating the circumference....");
		c1 = 2 * pi * rad;
		System.out.println("circumference is:" + c1);
	}

	public static void main(String[] args) {
		System.out.println("program started");
		circle obj1 = new circle(2.1);
		obj1.area();
		System.out.println(".........................");
		obj1.circum();
	}
}
