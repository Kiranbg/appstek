package nine;

class program3 {
	public static void main(String[] args) {
		System.out.println("program started");
		int n = 5;
		int space = n - 1;
		int star = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				if (k == 1 || k == star || i == n) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}
}