package thirteen;

class demo1 {
	static int i = 12;
	int j = 23;
}

class program1 {
	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println("i value:" + demo1.i);
		demo1 d1 = new demo1();
		System.out.println("j value" + d1.j);
		System.out.println("program started");
	}
}
