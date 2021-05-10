package nine;

class program1 {
	public static void main(String[] args) {
		System.out.println("program started");
		int n = 7;
		int space = n - 1;
		int star = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}
}