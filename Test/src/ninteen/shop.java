package ninteen;

class shop {
	String name;

	shop(String name) {
		this.name = name;
	}

	pen buypen(double amt) {
		pen ref1 = null;
		if (amt >= 10.00) {
			ref1 = new pen("black", 10.00);
		}
		return ref1;
	}

	noteBook buybook(double amt) {
		noteBook ref1 = null;
		if (amt >= 35.00) {
			ref1 = new noteBook(50, 35.00);
		}
		return ref1;
	}
}
