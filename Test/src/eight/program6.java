package eight;

class program6 {
	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println("total strings:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("program ended");
	}
}