package fifteen;

class pen {
	String inkColor;
	String brand;

	pen(String arg1, String arg2) {
		System.out.println("creating pen instance");
		inkColor = arg2;
		brand = arg1;
	}

	void ddetails() {
		System.out.println("brand name is:" + brand);
		System.out.println("Ink color is:" + inkColor);
	}

	public static void main(String[] args) {
		System.out.println("program started");
		pen p1 = new pen("cello", "black");
		p1.ddetails();
		System.out.println("...........");
		pen p2 = new pen("mountax", "blue");
		p2.ddetails();
		System.out.println("program ended");
	}
}
