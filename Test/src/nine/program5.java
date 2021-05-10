package nine;

class program5 {
	public static void main(String[] args) {
		System.out.println("program started");
		int n = 20;
		int mid = ((n / 2) + 1);
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < mid) {
				star++;
			} else {
				star--;
			}
		}
	}
}
