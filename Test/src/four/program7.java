package four;

class program7
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
		System.out.println("square of 5: "+square(5));
		System.out.println("square of 9: "+square(9));
		System.out.println("program ended");
	}
}