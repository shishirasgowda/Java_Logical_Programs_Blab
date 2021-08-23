package logicalprogram;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		System.out.println("Program to find the Binary number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find binary value:");
		int userInput=sc.nextInt();
		int Binary=0,Sum=0;
		while(userInput>0) 
		{
			for(int i=0; i<userInput; i++) 
			{
				
				if (userInput == (int)Math.pow(2,i))
				{
					Sum=(int) Math.pow(10,(i));
					Binary+=Sum;
					userInput-=(int) Math.pow(2,(i));
					break;
				}
				else if (userInput < (int)Math.pow(2,i)) 
				{
					Sum=(int) Math.pow(10,(i-1));
					Binary+=Sum;
					userInput-=(int) Math.pow(2,(i-1));
					break;
				}
			}
		}
		System.out.println("Decimal to Binary conversion is : " + Binary);
	}
}