package thirteen;

class notebook {
	String compName;
	String type;
	int pages;
	double cost;

	void detail() {
		System.out.println("company name is:" + compName);
		System.out.println("Book type:" + type);
		System.out.println("number of pages are:" + pages);
		System.out.println("cost of the book is:" + cost);
	}

	void open() {
		System.out.println("open the book");
	}

	void turnpages() {
		System.out.println("turn the pages");
	}

	void close() {
		System.out.println("close the book");
	}
}

class mainprog {
	public static void main(String[] args) {
		System.out.println("program started");
		notebook n1 = new notebook();
		n1.compName = "ITC";
		n1.type = "hardbind";
		n1.pages = 200;
		n1.cost = 58.80;

		n1.detail();
		n1.open();
		n1.turnpages();
		n1.close();
		System.out.println("program ended");
	}
}
