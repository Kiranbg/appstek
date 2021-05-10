package ninteen;

class noteBook {
	int pages;
	double price;

	noteBook(int pages, double price) {
		System.out.println("creating notebook instance");
		this.pages = pages;
		this.price = price;
	}

	void open() {
		System.out.println("opening book");
	}

	void close() {
		System.out.println("closing book");
	}

	void turnPages() {
		System.out.println("turning to next page");
	}
}
