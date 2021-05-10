package fifteen;

class count {
	String inkColor;
	String brand;
	static int count;

	count(String arg1, String arg2) {
		System.out.println("creating pen instance");
		inkColor = arg2;
		brand = arg1;
	}

	void details() {
		System.out.println("brand name is:" + brand);
		System.out.println("Ink color is:" + inkColor);
		count++;
	}

	void print() {
		System.out.println("count value" + count);
	}

	public static void main(String[] args) {
		System.out.println("..................");
		System.out.println("program started");
		count p1 = new count("cello", "black");
		p1.details();
		System.out.println("..................");
		count p2 = new count("montex", "blue");
		p2.details();
		System.out.println("..................");
		count p3 = new count("reynolds", "green");
		p3.details();
		System.out.println("..................");
		count p4 = new count("montex", "red");
		p4.details();
		System.out.println("..................");
		count p5 = new count("montex", "blue");
		p5.details();
		System.out.println("..................");
		System.out.println("Number of objects created are: " + count);
	}
}
