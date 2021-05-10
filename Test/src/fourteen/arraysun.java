package fourteen;

class arraysun {
	public static void main(String[] args) {
		System.out.println("program started");
		String str = "sun rises in the east";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
