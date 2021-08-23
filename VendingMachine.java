package logicalprogram;

import java.util.Scanner;

public class VendingMachine 
{
	public static void vendingmachine(int[] noteArray)
	{
		int change;
		Scanner sc = new Scanner(System.in);		
		System.out.println("change to be returned ");
		change = sc.nextInt();
		int count,totalNotes = 0;
		System.out.println("different types of denominations and their count:");
		for(int i=0;i<8;i++) 
		{
			count=change/noteArray[i]; 
			if(count>0) 
				System.out.println(noteArray[i]+"\tx\t"+count+"\t= "+noteArray[i]*count);
			totalNotes=totalNotes+count; 
			change=change%noteArray[i]; 
		}
		System.out.println("total no. of notes " +totalNotes);
	}
	public static void main(String[] args)
	{
		int[] noteArray= {1000,500,100,50,10,5,2,1};
		vendingmachine(noteArray);
	}
}
