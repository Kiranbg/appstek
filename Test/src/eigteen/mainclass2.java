package eigteen;

class student {
	final int id;
	String name;

	student(int arg1, String arg2) {
		System.out.println("creating student instance");
		id = arg1;
		name = arg2;
	}

	void dispInfo() {
		System.out.println("current object: " + this);
		System.out.println("student id: " + id);
		System.out.println("student name: " + name);
	}
}

class mainclass2 {
	public static void main(String[] args) {
		System.out.println("program started");
		student st1 = new student(12345, "Ramesh");
		student st2 = new student(23456, "Suresh");
		System.out.println("St1: " + st1);
		System.out.println("St2: " + st2);
		st1.dispInfo();
		st2.dispInfo();
		System.out.println("program ended");
	}
}
