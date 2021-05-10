package twenry_four;


// introduction to polymorphism
class a
{
	int i=12;
	char c='C';
	void atest()
	{
		System.out.println("Running test method");
	}
}

class b extends a
{
	float f=(float)12.21;
	boolean b=true;
	void bdisp()
	{
		System.out.println("Running disp method");
	}
}

class c extends b
{
	double d=21.33;
	long l=12345l;
	void cview()
	{
		System.out.println("Running view method");
	}
}

class d
{
	void dexecution(b arg1)
	{
		System.out.println("Running execution method");
		if(arg1 instanceof c)
		{
		arg1.atest();
		arg1.bdisp();
		//arg1.cview();
		}
		else
		{
		System.out.println("passed instance doesn't have demo1 propreties");
		}
	}
}
class practice1 
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
		System.out.println(".................................");
		d str=new d();
		str.dexecution(new c());
		str.dexecution(new b());
		//str.dexecution((c)new a());
		System.out.println("program ended");

	}
}
