package seven;

class program2
{
public static void main(String[] args)
{
System.out.println("program started");
int[] arr1=new int[50];
System.out.println("array size is: "+arr1.length);
arr1[0]=10;
arr1[1]=20;
arr1[2]=30;
arr1[3]=40;
arr1[4]=50;
for(int i=0; i<arr1.length; i++)
{
	if(i==0)
	System.out.println("array values");
System.out.println(""+arr1[i]);
}
System.out.println("program ended");
}
}