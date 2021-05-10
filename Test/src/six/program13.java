package six;

import java.util.Scanner;
class program13 
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
        Scanner scn1= new Scanner(System.in);
		@SuppressWarnings("unused")
		String stName;
		int stAge;
		System.out.println("enter the student name");
		stName = scn1.next();
		System.out.println("enter the student age");
		stAge=scn1.nextInt();
		if(stAge>18)
		{
		System.out.println("he is eligible to vote");
		}
		else
		{
		System.out.println("not eligible to vote");
		}
		System.out.println("program ended");
		scn1.close();
		
	}
}
