package nine;

class program7 {
	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println();
		int n = 20;
		int mid = ((n / 2) + 1);
		int star1 = 1;
		int star2 = 1;
		int space1 = 1;
		int space2 = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < space1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star1; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= space2; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= star2; m++) {
				System.out.print("*");
			}
			if (i < mid) {
				space1++;
				space2 = space2 - 2;
			} else {
				space1--;
				space2 = space2 + 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("program ended");
	}
}