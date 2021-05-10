package fourteen;

class arraystring {
	public static void main(String[] args) {
		System.out.println("program started");
		String str = "unstoppable";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
