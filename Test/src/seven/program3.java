package seven;

class program3
{
public static void main(String[] args)
{
System.out.println("program started");
int[] arr1 = new int[10];
System.out.println("array length is: "+arr1.length);
arr1[0]=10;
arr1[1]=20;
arr1[2]=30;
arr1[3]=40;
arr1[4]=50;
arr1[5]=60;
arr1[6]=70;
arr1[7]=80;
arr1[8]=90;
arr1[9]=99;
for(int i=arr1.length-1; i>=0; i--)
	{
if(i==arr1.length-1)
System.out.println("array values in reverse:");
System.out.println(" "+arr1[i]);
}
System.out.println("program ended");
}
}