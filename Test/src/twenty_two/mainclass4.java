package twenty_two;

//data type casting while returning a method
class NumberOpr1 {
	double square(double num) {
		System.out.println("calculating the square of :" + num);
		double res = num * num;
		System.out.println("result is:" + (int) res);
		return res;
	}
}

class mainclass4 {
	public static void main(String[] args) {
		System.out.println("program started");
		double x1 = 7.99;
		NumberOpr1 obj1 = new NumberOpr1();
		obj1.square(x1);
		System.out.println("program ended");
	}
}
