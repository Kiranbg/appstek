package eight;

class program1
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
        String str="javadeveloper";
        System.out.println("given string is:"+str);
		int tot=str.length();
        System.out.println("total characters are:"+tot);
		char c1=str.charAt(4);
		System.out.println("char at position 4:"+c1);
		int i1=str.indexOf('e');
		System.out.println("first occurence of e:"+i1);
		int i2=str.indexOf('e',i1+1);
		System.out.println("second occurence of e:"+i2);
		int i3=str.lastIndexOf('e');
		System.out.println("last occurence of e:"+i3);
		System.out.println("program started");
	}
}