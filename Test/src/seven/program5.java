package seven;

import java.util.Scanner;

class program5 {

	static int[] fillArray(int[] arg) {
		Scanner scn1 = new Scanner(System.in);
		for (int i = 0; i < arg.length; i++) {
			System.out.println("enter element value");
			arg[i] = scn1.nextInt();
		}
		scn1.close();
		return arg;
	}

	static void printArray(int[] arg) {
		System.out.println("array elements are");
		for (int i = 0; i < arg.length; i++) {
			System.out.println(arg[i]);
		}
	}

	static int[] reverseArray(int[] arg) {
		System.out.print("reverse ");
		int[] tempArr = new int[arg.length];
		int j = 0;
		for (int i = arg.length - 1; i >= 0; i--) {
			tempArr[j] = arg[i];
			j++;
		}
		return tempArr;
	}

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner scn2 = new Scanner(System.in);
		System.out.println("enter array size");
		int size = scn2.nextInt();
		int[] arr1 = new int[size];

		arr1 = fillArray(arr1);
		printArray(arr1);
		int[] revArr = reverseArray(arr1);
		printArray(revArr);
		System.out.println("program ended");
		scn2.close();
	}
}