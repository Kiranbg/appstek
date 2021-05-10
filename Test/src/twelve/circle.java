package twelve;

class circle {
	double rad;
	final double pi = 3.14;

	void area() {
		System.out.println("calculating area");
		double a1 = pi * rad * rad;
		System.out.println("Area is:" + a1);
	}

	void circum() {
		System.out.println("calculating circumference");
		double c1 = 2 * pi * rad;
		System.out.println("circumference is:" + c1);
	}

	public static void main(String[] args) {
		System.out.println("program started");
		circle cir1 = new circle();
		cir1.rad = 2.9;
		cir1.area();
		cir1.circum();
		System.out.println("......................................");
		circle cir2 = new circle();
		cir2.rad = 3.9;
		cir2.area();
		cir2.circum();
		System.out.println("program ended");
	}
}