package seven;

import java.util.Scanner;

class program6 {
	static void square(int n) {
		int res = n * n;
		System.out.println("square of the number " + n + " is:");
		System.out.print(res + "");
		System.out.println("  ");
		if (n > 1) {
			square(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner scn1 = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scn1.nextInt();
		System.out.println("entered number is:" + num);
		square(num);
		System.out.println("program ended");
		scn1.close();
	}
}