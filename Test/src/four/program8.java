package four;

class program8
{
	static int square(int num1)
	{
		System.out.println("calculating square of "+num1);
		int tmp=num1*num1;
		return tmp;
	}
	public static void main(String[] args) 
	{
		System.out.println("program started here");
		int res=0;
		res=square(2)+square(3);
		System.out.println("result is "+res);
		System.out.println("program ended");
	}
}