package five;

class program5
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
		int pin=1212;
		double accBal=10000.00;
		double amt=5000.00;
		if(pin==1212)
		{
		System.out.println("valid pin");
		if (accBal>amt)
		{
			System.out.println("Witdrawn successfful");
			accBal=accBal-amt;
		}
		else
			{
		System.out.println("unable to process, pleace try later");
		System.out.println("Insufficient balance");
		}
		
        System.out.println("Account balance is :"+accBal);
		System.out.println("program ended");
	}
	else {
	System.out.print("Invalid pin");
	}
}
}