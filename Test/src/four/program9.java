package four;

class program9
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
		int x=6;
		int res1= square(x++);
		System.out.println("result is :"+res1);
		int res2=square(++x);
		System.out.println("result is :"+res2);
		System.out.println("program ended");
	}
}