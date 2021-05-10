package four;

class program4
{
	static void test(int arg1, double arg2)
	{
		System.out.println("running int arg test() method");
		System.out.println("arg1 value is: "+arg1);
		System.out.println("arg2 value is: "+arg2);
		return;
	}
	public static void main(String[] args) 
	{
		System.out.println("program started here");
		int x1=23;
		double y1=4.5;
		test(x1,y1);
		System.out.println("program ended");
	}
}