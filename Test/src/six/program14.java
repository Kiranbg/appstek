package six;

import java.util.Scanner;
class program14 
{
public static void main(String[] args) {
		System.out.println("program started");
        Scanner scn1=new Scanner(System.in);
		int pin;
		double balAmt=10000;
		double reqAmt;
        System.out.println("enter the pin code");
		pin=scn1.nextInt();
        if(pin==9999)
			{
	    System.out.println("valid pin code, enter the required amount");
        reqAmt=scn1.nextInt();
	    if(reqAmt<balAmt){
		System.out.println("withdrawn successful, thank you");
		}
	    else{
		System.out.println("insufficient bal, you have remaining with:"+balAmt+"rs");
		}}
		else if(pin!=9999)
	    {	
		System.out.println("invalid pin, pleace enter again");
		 }
		 System.out.println("program ended");
		 scn1.close();
		 }
}