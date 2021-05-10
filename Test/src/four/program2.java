package four;

class program2
{
	static void test(int arg1)
	{
		System.out.println("running int arg test() method");
		System.out.println("arg1 value is: "+arg1);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("program started here");
		test(12);
		test(15);
		System.out.println("program ended");
	}
}