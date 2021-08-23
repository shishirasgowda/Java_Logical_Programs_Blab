package logicalprogram;

import java.util.Scanner;

public class FibonnacciNumber
{
	public static void main(String[] args)
	{
		int i,range;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a range: ");
		range = sc.nextInt();
		int number1=0,number2=1,number3;
		System.out.println("fibonnaci series for given range:");
		System.out.println(number1);
		System.out.println(number2);
		for(i=1;i<range;i++)
		{
			number3=number1+number2;
			number1=number2;
			number2=number3;
			System.out.println(number3);
		}
		
	}
}