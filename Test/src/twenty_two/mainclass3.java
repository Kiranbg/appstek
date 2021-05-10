package twenty_two;

// data type casting while passing value to method argument
class NumberOpr {
	int square(int num) {
		System.out.println("calculating the square of :" + num);
		int res = num * num;
		System.out.println("result is:" + res);
		return res;
	}
}

class mainclass3 {
	public static void main(String[] args) {
		System.out.println("program started");
		double x1 = 7.11;
		NumberOpr obj1 = new NumberOpr();
		obj1.square((int) x1);
		System.out.println("program ended");

	}
}
