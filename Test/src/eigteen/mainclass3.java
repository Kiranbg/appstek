package eigteen;

class student2 {
	int id = 1234;

	student2(int id) {
		System.out.println("creating student instance");
		id = id;
		System.out.println("id value" + id);
	}
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		student2 st1 = new student2(12345);
		System.out.println("id value" + st1.id);
		System.out.println("program started");
	}
}
