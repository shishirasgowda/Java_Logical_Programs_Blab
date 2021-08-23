package logicalprogram;
import java.util.Scanner;

public class NewtonSqrt 
{
	public static void main(String[] args)
	{
		System.out.println("Program to find the Square root of a number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find sqrt:");
		int userInput=sc.nextInt();
		double t=userInput;
		double epsilon = (1e-15);
		while ((double) Math.abs(t-userInput/t) > epsilon*t )
		{	
		 t=(double) (t+userInput/t)/2;
		}
		System.out.println("Square root of "+userInput+" is "+t);
	}
}