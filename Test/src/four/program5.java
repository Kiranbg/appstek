package four;

class program5
{
	static int test()
	{
		System.out.println("running test() method");
		return 25;
	}
	public static void main(String[] args) 
	{
		System.out.println("program started here");
		int x1=test();
		System.out.println("x1 value is: "+x1);
		System.out.println("program ended");
	}
}