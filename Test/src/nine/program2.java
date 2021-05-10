package nine;

class program2 {
	public static void main(String[] args) {
		System.out.println("program started");
		int n = 5;
		int star = n;
		int space = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= space - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(k);
			}
			System.out.println();
			space++;
			star--;
		}
		System.out.println("program ended");
	}
}