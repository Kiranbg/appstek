package five;

class program6 
{
public static void main(String[] args)
	{
    System.out.println("program started");
	char grade='j';
	switch(grade)
		{
	case'A':System.out.println("FCD");
	break;
	case'B':System.out.println("First class");
	break;
	case'C':System.out.println("Second class");
	break;
	case'D':System.out.println("Just pass");
	break;
	case'E':System.out.println("Failed");
	break;
	default:System.out.println("Invalid");
	break;
		}
	System.out.println("program ended");	
    }
}