package fifteen;

class pen1 {
	String inkColor;
	String brand;
	int cnt;

	pen1(String arg1, String arg2) {
		System.out.println("creating pen instance");
		inkColor = arg2;
		brand = arg1;
		cnt++;
	}

	void details() {
		System.out.println("brand name is:" + brand);
		System.out.println("Ink color is:" + inkColor);
	}

	public static void main(String[] args) {
		System.out.println("program started");
		pen1 p1 = new pen1("cello", "black");
		p1.details();
		System.out.println("...........");
		count p2 = new count("mountax", "blue");
		p2.details();
		System.out.println("count is:" + p2.count);
		System.out.println("program ended");
	}
}
