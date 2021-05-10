package thirteen;

class pen {
	String inkColor;
	double price;
	String compName;

	void write() {
		System.out.println("writing....");
	}

	void refill() {
		System.out.println("refilling.....");
	}

	void throwPen() {
		System.out.println("throwing");
	}

	void details() {
		System.out.println("Ink color is:" + inkColor);
		System.out.println("Price is:" + price);
		System.out.println("Brand name is:" + compName);
	}
}

class mainpen {
	public static void main(String[] args) {
		System.out.println("program started");
		pen p1 = new pen();
		p1.inkColor = "Black";
		p1.price = 15.50;
		p1.compName = "cello";

		p1.details();
		p1.write();
		p1.refill();
		p1.throwPen();
		System.out.println("program started");
	}
}
