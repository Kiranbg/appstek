package nine;

class program6 {
	public static void main(String[] args) {
		System.out.println("program started");
		int n = 20;
		int mid = ((n / 2) + 1);
		int space = n - 1;
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < mid) {
				space--;
				star++;
			} else {
				space++;
				star--;
			}
		}
	}
}
