package ninteen;

class pen {
	String inkColor;
	double price;

	pen(String inkColor, double price) {
		System.out.println("creating pen instances");
		this.inkColor = inkColor;
		this.price = price;
	}

	void write() {
		System.out.println("writing with " + inkColor + " pen");
	}
}
