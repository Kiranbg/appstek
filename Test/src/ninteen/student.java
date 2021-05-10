package ninteen;

class student {
	String name;

	student(String name) {
		this.name = name;
	}

	void preparenotes(pen arg1, noteBook arg2) {
		System.out.println("preparing notes on JAVA");
		arg2.open();
		arg1.write();
		arg2.turnPages();
		arg1.write();
		arg2.close();
	}
}
