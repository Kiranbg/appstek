package seven;

import java.util.Scanner;
class program4
{
public static void main(String[] args)
{
System.out.println("program started");
Scanner scn1= new Scanner(System.in);
System.out.println("enter the array size");
int size=scn1.nextInt();
int arr1[]=new int[size];
System.out.println("Array size is: "+size);

for(int i=0; i<arr1.length; i++)
	{
System.out.println("enter the element value");
arr1[i]= scn1.nextInt();
	}
System.out.println("array elements are");
for(int i=0; i<arr1.length; i++)
	{
System.out.println(arr1[i]);
	}
System.out.println("program ended");
scn1.close();
}
}