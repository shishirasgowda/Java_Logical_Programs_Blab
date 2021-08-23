package logicalprogram;

import java.util.Scanner;

public class NibbleSwap
{
	public static void main(String[] args) 
	{
		System.out.println("Program for swapping nibbles of Binary");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find binary value:");
		int userNumber=sc.nextInt();
		String B= Integer.toBinaryString(userNumber);
		System.out.println("Binary of "+userNumber+" is "+B);
		
		int Bin1=Integer.parseInt(B);
		int nibb1= Bin1/10000;
		int nibb2= Bin1%10000;
		int swap= nibb2*10000;
		int Binary=swap+nibb1;
		System.out.println("After swapping Binary is "+Binary);
		String s=String.valueOf(Binary);
		int Decimal=Integer.parseInt(s,2);
		System.out.println("Decimal of "+Binary+" is "+Decimal);
		userNumber=Decimal;
	
		while(Decimal>1)
		{
			if (Decimal%2==0)
			{
				Decimal=Decimal/2;
			}
			else
			{
				Decimal=0;
			}
		}
		if (Decimal==0)
		{
			System.out.println(userNumber+" is not a power of 2");
		}
		else
		{
			System.out.println(userNumber+" is power of 2");
		}
	}
}