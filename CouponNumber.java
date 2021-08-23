package logicalprogram;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber 
{
	public static void main(String[] args) {
		System.out.println("Program for Calling Coupon Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of distinct values");
		int number=sc.nextInt();
		
		Random ran= new Random();
		int distinct[]= new int[number];
		for(int i=0;i<number;i++)
		{
			int dist=ran.nextInt(10)+1;
			if(i==0)
			{
				distinct[i]=dist;
			}
			else
				{
					for(int j=0;j<i;j++) 
					{
						if(dist==distinct[j])
						{i--; break;}
						else if (j==i-1)
						distinct[i]=dist;
					}
				}
		}
		
		for(int a=0;a<number;a++) System.out.print(distinct[a]+" ");
		int count=0,k=0,Ticket=0;
		int tick[]= new int[100];
		while(count<number)
		{
			int coupon=ran.nextInt(10)+1;
			tick[Ticket]=coupon;
			if (Ticket>0)
			{ 
				Ticket++;	
				for(int a=0;a<Ticket;a++)
				{
					int[] coup1 = null;
					if(coupon==coup1[a]) Ticket--;
				}
			}
			else
			{ 
				Ticket++;
				for(int j=0;j<distinct.length;j++)
				{
					if (coupon==distinct[j])
					{	count++;
						System.out.println(count);
						System.out.println("Coupon Number "+coupon+" is got in "+Ticket+" random number");
					}
				}
			}
		}
	}
}